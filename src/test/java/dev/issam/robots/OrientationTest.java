package dev.issam.robots;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class OrientationTest {

    @Test
    void givenRobot_whenInitializing_thenPositionIsOk() {
        int x = 45, y = 58;
        Tondeuse tondeuse = new Tondeuse(x, y, Orientation.N, new Pelouse(100,100));
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(x);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(y);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.N);
    }

    @Test
    void givenRobot_whenMovingLeft_thenOrientationMove() {
        Tondeuse tondeuse = new Tondeuse(1, 1, Orientation.N, new Pelouse(100,100));
        tondeuse.getOrientation().move(tondeuse, Action.G);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.W);
        tondeuse.getOrientation().move(tondeuse, Action.G);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.S);
        tondeuse.getOrientation().move(tondeuse, Action.G);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.E);
        tondeuse.getOrientation().move(tondeuse, Action.G);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.N);
        tondeuse.getOrientation().move(tondeuse, Action.G);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.W);
    }

    @Test
    void givenRobot_whenMovingRight_thenOrientationMove() {
        Tondeuse tondeuse = new Tondeuse(1, 1, Orientation.E, new Pelouse(100,100));
        tondeuse.getOrientation().move(tondeuse, Action.D);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.S);
        tondeuse.getOrientation().move(tondeuse, Action.D);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.W);
        tondeuse.getOrientation().move(tondeuse, Action.D);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.N);
        tondeuse.getOrientation().move(tondeuse, Action.D);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.E);
        tondeuse.getOrientation().move(tondeuse, Action.D);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.S);
    }

    @Test
    void givenRobot_whenMovingForward_thenOrientationUnchanged() {
        Tondeuse tondeuse = new Tondeuse(1, 1, Orientation.S, new Pelouse(100,100));
        tondeuse.getOrientation().move(tondeuse, Action.A);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.S);
    }

}
