package dev.issam.robots;

import dev.issam.robots.enums.Orientation;
import dev.issam.robots.enums.Action;
import dev.issam.robots.model.Lawn;
import dev.issam.robots.model.Mower;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MowerCircuitDestinationTest {

    @Test
    void givenMowerLeftDown_whenGoingNorthEast_thenMowerUpRight() {
        Mower mower = new Mower(0, 0, Orientation.N, new Lawn(2, 2));
        mower.actions(List.of(Action.R
                , Action.A
                , Action.L
                , Action.A
                , Action.R
                , Action.A
                , Action.L
                , Action.A));
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(2);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(2);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.N);

    }

    @Test
    void givenMowerRightUpperCorner_whenGoingSouthWest_thenMowerDownLeft() {
        Mower mower = new Mower(2, 2, Orientation.N, new Lawn(2, 2));
        mower.actions(List.of(Action.L,
                Action.A,
                Action.L,
                Action.A,
                Action.R,
                Action.A,
                Action.L,
                Action.A));
        Assertions.assertThat(mower.getPosition().getX()).isZero();
        Assertions.assertThat(mower.getPosition().getY()).isZero();
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.S);
    }

}
