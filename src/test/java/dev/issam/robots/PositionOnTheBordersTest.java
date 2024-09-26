package dev.issam.robots;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PositionOnTheBordersTest {

    @Test
    void givenPositionOutsideLawn_whenIncrementY_thenPositionIsNotUpdated() {
        int initialX = 100;
        int initialY = 100;
        Position p = new Position(initialX, initialY, new Lawn(100, 100));
        Assertions.assertThat(p.getX()).isEqualTo(initialX);
        Assertions.assertThat(p.getY()).isEqualTo(initialY);

        p.incrementY();
        Assertions.assertThat(p.getX()).isEqualTo(initialX);
        Assertions.assertThat(p.getY()).isEqualTo(initialY);
    }

    @Test
    void givenPositionOutsideLawn_whenIncrementX_thenPositionIsNotUpdated() {
        int initialX = 100;
        int initialY = 100;
        Position p = new Position(initialX, initialY, new Lawn(100, 100));
        Assertions.assertThat(p.getX()).isEqualTo(initialX);
        Assertions.assertThat(p.getY()).isEqualTo(initialY);

        p.incrementX();
        Assertions.assertThat(p.getX()).isEqualTo(initialX);
        Assertions.assertThat(p.getY()).isEqualTo(initialY);
    }

    @Test
    void givenPositionOutsideLawn_whenDecrementY_thenPositionIsNotUpdated() {
        int initialX = 0;
        int initialY = 0;
        Position p = new Position(initialX, initialY, new Lawn(100, 100));
        Assertions.assertThat(p.getX()).isEqualTo(initialX);
        Assertions.assertThat(p.getY()).isEqualTo(initialY);

        p.decrementX();
        Assertions.assertThat(p.getX()).isEqualTo(initialX);
        Assertions.assertThat(p.getY()).isEqualTo(initialY);
    }

    @Test
    void givenPositionOutsideLawn_whenDecrementXY_andDecrementXY_thenPositionIsNotUpdated() {
        int initialX = 0;
        int initialY = 0;
        Position p = new Position(initialX, initialY, new Lawn(100, 100));
        Assertions.assertThat(p.getX()).isEqualTo(initialX);
        Assertions.assertThat(p.getY()).isEqualTo(initialY);

        p.decrementY();
        Assertions.assertThat(p.getX()).isEqualTo(initialX);
        Assertions.assertThat(p.getY()).isEqualTo(initialY);
    }

}
