package dev.issam.robots;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Tondeuse {

    private Position position;
    private Orientation orientation;

    public Tondeuse(int x, int y, Orientation orientation, Pelouse pelouse) {
        this.position = new Position(x, y, pelouse);
        this.orientation = orientation;
    }

    public void singleAction(Action action) {
        orientation.move(this, action);
    }

    public void actions(List<Action> action) {
        action.stream().forEach(singleAction -> orientation.move(this, singleAction));
    }

}
