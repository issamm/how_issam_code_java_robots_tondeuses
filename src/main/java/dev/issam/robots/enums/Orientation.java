package dev.issam.robots.enums;

import dev.issam.robots.action.*;
import lombok.Getter;

@Getter
public enum Orientation {
    N(new ApplyActionOnNorthOrientedMower()),
    E(new ApplyActionOnEastOrientedMower()),
    W(new ApplyActionOnWestOrientedMower()),
    S(new ApplyActionOnSouthOrientedMower());

    private final ApplyActionOnOrientedMower applyActionOnOrientedMower;

    Orientation(ApplyActionOnOrientedMower applyActionOnOrientedMower) {
        this.applyActionOnOrientedMower = applyActionOnOrientedMower;
    }

}
