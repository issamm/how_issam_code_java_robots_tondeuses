package dev.issam.robots.action;

import dev.issam.robots.enums.Action;
import dev.issam.robots.model.Mower;

/**
 * Abstract super class.
 * Children class define the Mower behavior given, as an input, an Action.
 */
public abstract class ApplyActionOnOrientedMower {

    /**
     *
     * @param mower
     * @param action
     */
    public void apply(Mower mower, Action action) {
        switch (action) {
            case L -> left(mower);
            case R -> right(mower);
            case A -> advance(mower);
        }
    }

    /**
     * Apply a LEFT action on a mower.
     * @param mower Mower on which an action is applied.
     */
    public abstract void left(Mower mower);

    /**
     * Apply a RIGHT action on a mower.
     * @param mower Mower on which an action is applied.
     */
    public abstract void right(Mower mower);

    /**
     * Apply an ADVANCE action on a mower.
     * @param mower Mower on which an action is applied.
     */
    public abstract void advance(Mower mower);
}
