package dev.issam.robots.action;

import dev.issam.robots.enums.Orientation;
import dev.issam.robots.model.Mower;

public class ApplyActionOnEastOrientedMower extends ApplyActionOnOrientedMower {

    @Override
    public void left(Mower mower) {
        mower.setOrientation(Orientation.N);
    }

    @Override
    public void right(Mower mower) {
        mower.setOrientation(Orientation.S);
    }

    @Override
    public void advance(Mower mower) {
        mower.getPosition().incrementX();
    }
}
