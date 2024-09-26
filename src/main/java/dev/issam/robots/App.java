package dev.issam.robots;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pelouseStr = sc.nextLine();
        log(String.format("Ma pelouse a cette taille %s ", pelouseStr));
        Pelouse pelouse = pelouseFromStr(pelouseStr);
        while (sc.hasNextLine()) {
            String tondeuseStr = sc.nextLine();
            if(tondeuseStr == null || tondeuseStr.isBlank()){
                log("Fin du programme");
                return;
            }
            log(String.format("Ma tondeuse est ici %s", tondeuseStr));
            Tondeuse tondeuse = tondeusePositionAndOrientationFromStr(tondeuseStr, pelouse);
            String actionsStr = sc.nextLine();
            log(String.format("Les mouvements sont %s", actionsStr));
            List<Action> actions = actionsFromStr(actionsStr);
            tondeuse.actions(actions);
            log(String.format("Position finale %d %s", tondeuse.getPosition().getX(), tondeuse.getPosition().getY()));
        }
    }

    private static void log(String pelouseStr) {
        System.out.println(pelouseStr);
    }

    /**
     * @param actionsStr "GAGA" for "Gauche","Avance","Gauche","Avance"
     * @return List of actions
     */
    private static List<Action> actionsFromStr(String actionsStr) {
        Stream<String> actionsStream = actionsStr.codePoints().mapToObj(c -> String.valueOf((char) c));
        return actionsStream.map(Action::valueOf).toList();
    }

    /**
     * @param tondeuseStr "1 2 N" for a position on x=1, y=2 and orientation to the NORTH
     * @param pelouse Pelouse instance
     * @return Tondeuse instance
     */
    private static Tondeuse tondeusePositionAndOrientationFromStr(String tondeuseStr, Pelouse pelouse) {
        String[] positionAndOrientation = tondeuseStr.split(" ");
        return new Tondeuse(Integer.parseInt(positionAndOrientation[0]),
                Integer.parseInt(positionAndOrientation[1]),
                Orientation.valueOf(positionAndOrientation[2]),
                pelouse);
    }

    /**
     * @param pelouseStr "5 5" for a lawn of 5 by 5
     * @return Pelouse instance
     */
    private static Pelouse pelouseFromStr(String pelouseStr) {
        String[] size = pelouseStr.split(" ");
        return new Pelouse(Integer.parseInt(size[0]),
                Integer.parseInt(size[1]));
    }
}
