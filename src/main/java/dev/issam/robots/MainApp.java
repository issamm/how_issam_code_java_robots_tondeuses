package dev.issam.robots;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lawnStr = sc.nextLine();
        Lawn lawn = lawnFromStr(lawnStr);
        log(String.format("Lawn size %s %s", lawn.width(), lawn.height()));
        while (sc.hasNextLine()) {
            String mowerStr = sc.nextLine().trim();
            if(mowerStr == null || mowerStr.isBlank()){
                log("The end");
                return;
            }
            log(String.format("Mower location %s", mowerStr));
            Mower mower = mowerPositionAndOrientationFromStr(mowerStr, lawn);
            String actionsStr = sc.nextLine();
            log(String.format("Actions are %s", actionsStr));
            List<Action> actions = actionsFromStr(actionsStr);
            mower.actions(actions);
            log(String.format("Position finale %d %s", mower.getPosition().getX(), mower.getPosition().getY()));
        }
    }

    private static void log(String lawnStr) {
        System.out.println(lawnStr);
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
     * @param mowerStr "1 2 N" for a position on x=1, y=2 and orientation to the NORTH
     * @param lawn Lawn instance
     * @return Mower instance
     */
    private static Mower mowerPositionAndOrientationFromStr(String mowerStr, Lawn lawn) {
        String[] positionAndOrientation = mowerStr.split(" ");
        return new Mower(Integer.parseInt(positionAndOrientation[0]),
                Integer.parseInt(positionAndOrientation[1]),
                Orientation.valueOf(positionAndOrientation[2]),
                lawn);
    }

    /**
     * @param lawnStr "5 5" for a lawn of 5 by 5
     * @return Lawn instance
     */
    private static Lawn lawnFromStr(String lawnStr) {
        String[] size = lawnStr.split(" ");
        return new Lawn(Integer.parseInt(size[0]),
                Integer.parseInt(size[1]));
    }
}
