package dev.issam.robots.action;

import dev.issam.robots.enums.Orientation;
import dev.issam.robots.model.Mower;

public class ApplyActionOnSouthOrientedMower extends ApplyActionOnOrientedMower {

    @Override
    public void left(Mower mower) {
        mower.setOrientation(Orientation.E);
    }

    @Override
    public void right(Mower mower) {
        mower.setOrientation(Orientation.W);
    }

    @Override
    public void advance(Mower mower) {
        mower.getPosition().decrementY();
    }
}
