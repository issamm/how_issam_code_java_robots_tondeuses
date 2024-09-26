package dev.issam.robots;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TondeuseListOfSingleActionsTest {

    @Test
    void givenTondeuseLeftDown_whenGoingNorthEast_thenTondeuseUpRight(){
        Tondeuse tondeuse = new Tondeuse(0,0,Orientation.N, new Pelouse(2,2));
        tondeuse.singleAction(Action.D);
        Assertions.assertThat(tondeuse.getPosition().getX()).isZero();
        Assertions.assertThat(tondeuse.getPosition().getY()).isZero();
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.E);
        tondeuse.singleAction(Action.A);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(1);
        Assertions.assertThat(tondeuse.getPosition().getY()).isZero();
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.E);
        tondeuse.singleAction(Action.G);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(1);
        Assertions.assertThat(tondeuse.getPosition().getY()).isZero();
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.N);
        tondeuse.singleAction(Action.A);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(1);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(1);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.N);

        // Tondeuse now in [1;1]
        tondeuse.singleAction(Action.D);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(1);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(1);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.E);
        tondeuse.singleAction(Action.A);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(2);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(1);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.E);
        tondeuse.singleAction(Action.G);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(2);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(1);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.N);
        tondeuse.singleAction(Action.A);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(2);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(2);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.N);

        // Tondeuse now in [2;2] - right corner limit
        // Not moving anymore.
        tondeuse.singleAction(Action.A);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(2);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(2);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.N);
        tondeuse.singleAction(Action.D);
        tondeuse.singleAction(Action.A);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(2);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(2);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.E);
    }

    @Test
    void givenTondeuseRightUpperCorner_whenGoingSouthWest_thenTondeuseDownLeft(){
        Tondeuse tondeuse = new Tondeuse(2,2,Orientation.N, new Pelouse(2,2));
        tondeuse.singleAction(Action.G);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(2);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(2);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.W);
        tondeuse.singleAction(Action.A);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(1);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(2);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.W);
        tondeuse.singleAction(Action.G);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(1);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(2);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.S);
        tondeuse.singleAction(Action.A);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(1);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(1);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.S);

        // Tondeuse now in [1;1]
        tondeuse.singleAction(Action.D);
        Assertions.assertThat(tondeuse.getPosition().getX()).isEqualTo(1);
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(1);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.W);
        tondeuse.singleAction(Action.A);
        Assertions.assertThat(tondeuse.getPosition().getX()).isZero();
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(1);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.W);
        tondeuse.singleAction(Action.G);
        Assertions.assertThat(tondeuse.getPosition().getX()).isZero();
        Assertions.assertThat(tondeuse.getPosition().getY()).isEqualTo(1);
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.S);
        tondeuse.singleAction(Action.A);
        Assertions.assertThat(tondeuse.getPosition().getX()).isZero();
        Assertions.assertThat(tondeuse.getPosition().getY()).isZero();
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.S);

        // Tondeuse now in [0;0] - left down corner
        // Not moving anymore
        tondeuse.singleAction(Action.A);
        Assertions.assertThat(tondeuse.getPosition().getX()).isZero();
        Assertions.assertThat(tondeuse.getPosition().getY()).isZero();
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.S);
        tondeuse.singleAction(Action.D);
        tondeuse.singleAction(Action.A);
        Assertions.assertThat(tondeuse.getPosition().getX()).isZero();
        Assertions.assertThat(tondeuse.getPosition().getY()).isZero();
        Assertions.assertThat(tondeuse.getOrientation()).isEqualTo(Orientation.W);
    }

}
