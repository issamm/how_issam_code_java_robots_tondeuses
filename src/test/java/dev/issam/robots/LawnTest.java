package dev.issam.robots;

import dev.issam.robots.model.Lawn;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LawnTest {

    @Test
    void givenBigLawn_whenTestingPositionOnLawn_thenIsInsideReturnsTrue() {
        int height = 80;
        int width = 80;
        Lawn lawn = new Lawn(width, height);
        Assertions.assertThat(lawn).isNotNull();
        Assertions.assertThat(lawn.isInside(0, 0)).isTrue();
        Assertions.assertThat(lawn.isInside(width, height)).isTrue();

        Assertions.assertThat(lawn.isInside(1, 1)).isTrue();
        Assertions.assertThat(lawn.isInside(1, height / 2)).isTrue();
        Assertions.assertThat(lawn.isInside(width / 2, height / 2)).isTrue();
    }

    @Test
    void givenBigLawn_whenTestingPositionOutOfLawn_thenIsInsideReturnsFalse() {
        int height = 80;
        int width = 80;
        Lawn lawn = new Lawn(width, height);
        Assertions.assertThat(lawn).isNotNull();
        Assertions.assertThat(lawn.isInside(-1, 0)).isFalse();
        Assertions.assertThat(lawn.isInside(-1, -1)).isFalse();
        Assertions.assertThat(lawn.isInside(0, -1)).isFalse();
        Assertions.assertThat(lawn.isInside(0, -2)).isFalse();
        Assertions.assertThat(lawn.isInside(width, height + 1)).isFalse();
        Assertions.assertThat(lawn.isInside(width + 1, height)).isFalse();
        Assertions.assertThat(lawn.isInside(width + 1, height + 1)).isFalse();
    }

}
