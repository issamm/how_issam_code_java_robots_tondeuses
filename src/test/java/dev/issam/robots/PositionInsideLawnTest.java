package dev.issam.robots;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PositionInsideLawnTest {

    @Test
    void givenPositionInsideLawn_whenIncrementXY_andDecrementXY_thenPositionIsUpdated() {
        int initialX = 50;
        int initialY = 50;
        Position p = new Position(initialX, initialY, new Lawn(100, 100));
        Assertions.assertThat(p.getX()).isEqualTo(initialX);
        Assertions.assertThat(p.getY()).isEqualTo(initialY);

        p.incrementY();
        Assertions.assertThat(p.getX()).isEqualTo(initialX);
        Assertions.assertThat(p.getY()).isEqualTo(initialY + 1);

        p.incrementX();
        Assertions.assertThat(p.getX()).isEqualTo(initialX + 1);
        Assertions.assertThat(p.getY()).isEqualTo(initialY + 1);

        p.decrementY();
        Assertions.assertThat(p.getX()).isEqualTo(initialX + 1);
        Assertions.assertThat(p.getY()).isEqualTo(initialY);

        p.decrementX();
        Assertions.assertThat(p.getX()).isEqualTo(initialX);
        Assertions.assertThat(p.getY()).isEqualTo(initialY);

        p.decrementY();
        p.decrementX();
        Assertions.assertThat(p.getX()).isEqualTo(initialX - 1);
        Assertions.assertThat(p.getY()).isEqualTo(initialY - 1);
    }

}
