package dev.issam.robots;

import dev.issam.robots.enums.Orientation;
import dev.issam.robots.enums.Action;
import dev.issam.robots.model.Lawn;
import dev.issam.robots.model.Mower;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MowerCircuitStepByStepActionsTest {

    @Test
    void givenMowerLeftDown_whenGoingNorthEast_thenMowerUpRight(){
        Mower mower = new Mower(0,0, Orientation.N, new Lawn(2,2));
        mower.singleAction(Action.R);
        Assertions.assertThat(mower.getPosition().getX()).isZero();
        Assertions.assertThat(mower.getPosition().getY()).isZero();
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.E);
        mower.singleAction(Action.A);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(1);
        Assertions.assertThat(mower.getPosition().getY()).isZero();
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.E);
        mower.singleAction(Action.L);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(1);
        Assertions.assertThat(mower.getPosition().getY()).isZero();
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.N);
        mower.singleAction(Action.A);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(1);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(1);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.N);

        // Mower now in [1;1]
        mower.singleAction(Action.R);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(1);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(1);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.E);
        mower.singleAction(Action.A);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(2);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(1);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.E);
        mower.singleAction(Action.L);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(2);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(1);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.N);
        mower.singleAction(Action.A);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(2);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(2);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.N);

        // Mower now in [2;2] - right corner limit
        // Not moving anymore.
        mower.singleAction(Action.A);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(2);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(2);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.N);
        mower.singleAction(Action.R);
        mower.singleAction(Action.A);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(2);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(2);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.E);
    }

    @Test
    void givenMowerRightUpperCorner_whenGoingSouthWest_thenMowerDownLeft(){
        Mower mower = new Mower(2,2,Orientation.N, new Lawn(2,2));
        mower.singleAction(Action.L);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(2);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(2);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.W);
        mower.singleAction(Action.A);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(1);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(2);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.W);
        mower.singleAction(Action.L);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(1);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(2);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.S);
        mower.singleAction(Action.A);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(1);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(1);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.S);

        // Mower now in [1;1]
        mower.singleAction(Action.R);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(1);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(1);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.W);
        mower.singleAction(Action.A);
        Assertions.assertThat(mower.getPosition().getX()).isZero();
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(1);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.W);
        mower.singleAction(Action.L);
        Assertions.assertThat(mower.getPosition().getX()).isZero();
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(1);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.S);
        mower.singleAction(Action.A);
        Assertions.assertThat(mower.getPosition().getX()).isZero();
        Assertions.assertThat(mower.getPosition().getY()).isZero();
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.S);

        // Mower now in [0;0] - left down corner
        // Not moving anymore
        mower.singleAction(Action.A);
        Assertions.assertThat(mower.getPosition().getX()).isZero();
        Assertions.assertThat(mower.getPosition().getY()).isZero();
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.S);
        mower.singleAction(Action.R);
        mower.singleAction(Action.A);
        Assertions.assertThat(mower.getPosition().getX()).isZero();
        Assertions.assertThat(mower.getPosition().getY()).isZero();
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.W);
    }

}
