package dev.issam.robots;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ChangeOrientationTest {

    @Test
    void givenRobot_whenInitializing_thenPositionIsOk() {
        int x = 45, y = 58;
        Mower mower = new Mower(x, y, Orientation.N, new Lawn(100,100));
        Assertions.assertThat(mower.getPosition().getX()).isEqualTo(x);
        Assertions.assertThat(mower.getPosition().getY()).isEqualTo(y);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.N);
    }

    @Test
    void givenRobot_whenMovingLeft_thenOrientationMove() {
        Mower mower = new Mower(1, 1, Orientation.N, new Lawn(100,100));
        mower.getOrientation().move(mower, Action.L);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.W);
        mower.getOrientation().move(mower, Action.L);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.S);
        mower.getOrientation().move(mower, Action.L);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.E);
        mower.getOrientation().move(mower, Action.L);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.N);
        mower.getOrientation().move(mower, Action.L);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.W);
    }

    @Test
    void givenRobot_whenMovingRight_thenOrientationMove() {
        Mower mower = new Mower(1, 1, Orientation.E, new Lawn(100,100));
        mower.getOrientation().move(mower, Action.R);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.S);
        mower.getOrientation().move(mower, Action.R);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.W);
        mower.getOrientation().move(mower, Action.R);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.N);
        mower.getOrientation().move(mower, Action.R);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.E);
        mower.getOrientation().move(mower, Action.R);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.S);
    }

    @Test
    void givenRobot_whenMovingForward_thenOrientationUnchanged() {
        Mower mower = new Mower(1, 1, Orientation.S, new Lawn(100,100));
        mower.getOrientation().move(mower, Action.A);
        Assertions.assertThat(mower.getOrientation()).isEqualTo(Orientation.S);
    }

}
