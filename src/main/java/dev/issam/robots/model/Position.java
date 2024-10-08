package dev.issam.robots.model;

import lombok.Getter;

@Getter
public class Position {
    private int x;
    private int y;
    private final Lawn lawn;

    public Position(int x, int y, Lawn lawn) {
        this.x = x;
        this.y = y;
        this.lawn = lawn;
    }

    public void decrementX() {
        if (lawn.isInside(x - 1, y)) {
            --x;
        }
    }

    public void incrementX() {
        if (lawn.isInside(x + 1, y)) {
            ++x;
        }
    }

    public void decrementY() {
        if (lawn.isInside(x, y - 1)) {
            --y;
        }
    }

    public void incrementY() {
        if (lawn.isInside(x, y + 1)) {
            ++y;
        }
    }
}
