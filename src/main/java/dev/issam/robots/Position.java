package dev.issam.robots;

import lombok.Getter;

@Getter
public class Position {
    private int x;
    private int y;
    private final Pelouse pelouse;

    public Position(int x, int y, Pelouse pelouse) {
        this.x = x;
        this.y = y;
        this.pelouse = pelouse;
    }

    public void decrementX() {
        if (pelouse.isInside(x - 1, y)) {
            --x;
        }
    }

    public void incrementX() {
        if (pelouse.isInside(x + 1, y)) {
            ++x;
        }
    }

    public void decrementY() {
        if (pelouse.isInside(x, y - 1)) {
            --y;
        }
    }

    public void incrementY() {
        if (pelouse.isInside(x, y + 1)) {
            ++y;
        }
    }
}
