package dev.issam.robots;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TondeuseDestinationTest {

    @Test
    void givenTondeuseLeftDown_whenGoingNorthEast_thenTondeuseUpRight() {
        Tondeuse tondeuse = new Tondeuse(0, 0, Orientation.N, new Pelouse(2, 2));
        tondeuse.actions(List.of(Action.D
                , Action.A
                , Action.G
                , Action.A
                , Action.D
                , Action.A
                , Action.G
                , Action.A));
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(2);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(2);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.N);

    }

    @Test
    void givenTondeuseRightUpperCorner_whenGoingSouthWest_thenTondeuseDownLeft() {
        Tondeuse tondeuse = new Tondeuse(2, 2, Orientation.N, new Pelouse(2, 2));
        tondeuse.actions(List.of(Action.G,
                Action.A,
                Action.G,
                Action.A,
                Action.D,
                Action.A,
                Action.G,
                Action.A));
        Assertions.assertThat(tondeuse.getPosition().getX()).isZero();
        Assertions.assertThat(tondeuse.getPosition().getY()).isZero();
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.S);
    }

}
