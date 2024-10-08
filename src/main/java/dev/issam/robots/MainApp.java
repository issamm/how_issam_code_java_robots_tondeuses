package dev.issam.robots;

import dev.issam.robots.enums.Action;
import dev.issam.robots.model.Lawn;
import dev.issam.robots.model.Mower;

import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lawnStr = sc.nextLine();
        Lawn lawn = InputStringParser.readLawnSizeFromString(lawnStr);
        Logger.log(String.format("Lawn size %s %s", lawn.width(), lawn.height()));
        readMowerPositionAndActions(sc, lawn);
    }

    private static void readMowerPositionAndActions(Scanner sc, Lawn lawn) {
        while (sc.hasNextLine()) {
            Mower mower = InputStringParser.readMowerPositionAndOrientation(sc, lawn);
            if (mower == null){
                return;
            }
            List<Action> actionsToApplyToMower = InputStringParser.readActions(sc);
            mower.actions(actionsToApplyToMower);
            Logger.log(String.format("Position finale %d %s", mower.getPosition().getX(), mower.getPosition().getY()));
        }
    }

}
