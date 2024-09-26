package dev.issam.robots;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MovingTest {

    @Test
    void givenRobot_whenAdvancingToNorth_thenYIsUpdated() {
        int x = 45, y = 58;
        Tondeuse tondeuse = new Tondeuse(x, y, Orientation.N, new Pelouse(100,100));
        tondeuse.getOrientation().move(tondeuse, Action.A);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(x);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(y + 1);
    }

    @Test
    void givenRobot_whenAdvancingToEast_thenXIsUpdated() {
        int x = 45, y = 58;
        Tondeuse tondeuse = new Tondeuse(x, y, Orientation.E, new Pelouse(100,100));
        tondeuse.getOrientation().move(tondeuse, Action.A);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(x + 1);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(y);
    }

    @Test
    void givenRobot_whenAdvancingToWest_thenXIsUpdated() {
        int x = 45, y = 58;
        Tondeuse tondeuse = new Tondeuse(x, y, Orientation.W, new Pelouse(100,100));
        tondeuse.getOrientation().move(tondeuse, Action.A);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(x - 1);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(y);
    }

    @Test
    void givenRobot_whenAdvancingToSouth_thenYIsUpdated() {
        int x = 45, y = 58;
        Tondeuse tondeuse = new Tondeuse(x, y, Orientation.S, new Pelouse(100,100));
        tondeuse.getOrientation().move(tondeuse, Action.A);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(x);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(y - 1);
    }

}
