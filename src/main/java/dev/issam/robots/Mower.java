package dev.issam.robots;

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

    public void singleAction(Action action) {
        orientation.move(this, action);
    }

    public void actions(List<Action> action) {
        action.forEach(singleAction -> orientation.move(this, singleAction));
    }

}
