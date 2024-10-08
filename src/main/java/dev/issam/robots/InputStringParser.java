package dev.issam.robots;

import dev.issam.robots.enums.Orientation;
import dev.issam.robots.enums.Action;
import dev.issam.robots.model.Lawn;
import dev.issam.robots.model.Mower;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class InputStringParser {

    private InputStringParser(){}

    /**
     * Read lawn size from input string.
     * @param lawnStr "5 5" for a lawn of 5 by 5.
     * @return Lawn instance.
     */
    static Lawn readLawnSizeFromString(String lawnStr) {
        String[] size = lawnStr.split(" ");
        return new Lawn(Integer.parseInt(size[0]),
                Integer.parseInt(size[1]));
    }

    /**
     * Read the Mower position and its orientation.
     * @param sc Scanner to read from.
     * @param lawn Lawn instance.
     * @return The Mower instance.
     */
    static Mower readMowerPositionAndOrientation(Scanner sc, Lawn lawn) {
        String mowerPositionAndOrientationStr = sc.nextLine().trim();
        if(mowerPositionAndOrientationStr.isBlank()){
            Logger.log("The end");
            return null;
        }
        Logger.log(String.format("Mower location %s", mowerPositionAndOrientationStr));
        return mowerPositionAndOrientationFromStr(mowerPositionAndOrientationStr, lawn);
    }

    /**
     * Read actions from input string. Those actions will be applied to the mower.
     * @param sc Scanner.
     * @return A List of Actions.
     */
    static List<Action> readActions(Scanner sc) {
        String actionsStr = sc.nextLine();
        Logger.log(String.format("Actions are %s", actionsStr));
        return parseGroupedActionsStringAndSplit(actionsStr);
    }

    /**
     * @param actionsStr "GAGA" for "Gauche","Avance","Gauche","Avance"
     * @return List of actions
     */
    private static List<Action> parseGroupedActionsStringAndSplit(String actionsStr) {
        Stream<String> actionsStream = actionsStr.codePoints().mapToObj(c -> String.valueOf((char) c));
        return actionsStream.map(Action::valueOf).toList();
    }

    /**
     * @param mowerPositionAndOrientationStr "1 2 N" for a position on x=1, y=2 and orientation to the NORTH
     * @param lawn Lawn instance
     * @return Mower instance
     */
    private static Mower mowerPositionAndOrientationFromStr(String mowerPositionAndOrientationStr, Lawn lawn) {
        String[] positionAndOrientation = mowerPositionAndOrientationStr.split(" ");
        return new Mower(Integer.parseInt(positionAndOrientation[0]),
                Integer.parseInt(positionAndOrientation[1]),
                Orientation.valueOf(positionAndOrientation[2]),
                lawn);
    }

}
