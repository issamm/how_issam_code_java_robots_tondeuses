package dev.issam.robots.model;

import dev.issam.robots.enums.Action;
import dev.issam.robots.enums.Orientation;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Mower {

    private Position position;
    private Orientation orientation;

    public Mower(int x, int y, Orientation orientation, Lawn lawn) {
        this.position = new Position(x, y, lawn);
        this.orientation = orientation;
    }

    public void actions(List<Action> action) {
        action.forEach(this::singleAction);
    }

    public void singleAction(Action action) {
        orientation.getApplyActionOnOrientedMower().apply(this, action);
    }

}
