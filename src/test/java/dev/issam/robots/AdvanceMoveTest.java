package dev.issam.robots;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AdvanceMoveTest {

    @Test
    void givenRobot_whenAdvancingToNorth_thenYIsUpdated() {
        int x = 45, y = 58;
        Mower mower = new Mower(x, y, Orientation.N, new Lawn(100,100));
        mower.getOrientation().move(mower, Action.A);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(x);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(y + 1);
    }

    @Test
    void givenRobot_whenAdvancingToEast_thenXIsUpdated() {
        int x = 45, y = 58;
        Mower mower = new Mower(x, y, Orientation.E, new Lawn(100,100));
        mower.getOrientation().move(mower, Action.A);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(x + 1);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(y);
    }

    @Test
    void givenRobot_whenAdvancingToWest_thenXIsUpdated() {
        int x = 45, y = 58;
        Mower mower = new Mower(x, y, Orientation.W, new Lawn(100,100));
        mower.getOrientation().move(mower, Action.A);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(x - 1);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(y);
    }

    @Test
    void givenRobot_whenAdvancingToSouth_thenYIsUpdated() {
        int x = 45, y = 58;
        Mower mower = new Mower(x, y, Orientation.S, new Lawn(100,100));
        mower.getOrientation().move(mower, Action.A);
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(x);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(y - 1);
    }

}
