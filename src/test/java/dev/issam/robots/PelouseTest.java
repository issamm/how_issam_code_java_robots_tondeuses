package dev.issam.robots;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PelouseTest {

    @Test
    void givenBigLawn_whenTestingPositionOnLawn_thenIsInsideReturnsTrue() {
        int height = 80;
        int width = 80;
        Pelouse pelouse = new Pelouse(width, height);
        Assertions.assertThat(pelouse).isNotNull();
        Assertions.assertThat(pelouse.isInside(0, 0)).isTrue();
        Assertions.assertThat(pelouse.isInside(width, height)).isTrue();

        Assertions.assertThat(pelouse.isInside(1, 1)).isTrue();
        Assertions.assertThat(pelouse.isInside(1, height / 2)).isTrue();
        Assertions.assertThat(pelouse.isInside(width / 2, height / 2)).isTrue();
    }

    @Test
    void givenBigLawn_whenTestingPositionOutOfLawn_thenIsInsideReturnsFalse() {
        int height = 80;
        int width = 80;
        Pelouse pelouse = new Pelouse(width, height);
        Assertions.assertThat(pelouse).isNotNull();
        Assertions.assertThat(pelouse.isInside(-1, 0)).isFalse();
        Assertions.assertThat(pelouse.isInside(-1, -1)).isFalse();
        Assertions.assertThat(pelouse.isInside(0, -1)).isFalse();
        Assertions.assertThat(pelouse.isInside(0, -2)).isFalse();
        Assertions.assertThat(pelouse.isInside(width, height + 1)).isFalse();
        Assertions.assertThat(pelouse.isInside(width + 1, height)).isFalse();
        Assertions.assertThat(pelouse.isInside(width + 1, height + 1)).isFalse();
    }

}
