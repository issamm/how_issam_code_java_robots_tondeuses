package dev.issam.robots;

public enum Orientation {
    N {
        @Override
        public void move(Mower mower, Action action) {
            switch (action) {
                case L -> mower.setOrientation(W);
                case R -> mower.setOrientation(E);
                case A -> mower.getPosition().incrementY();
            }
        }
    },
    E {
        @Override
        public void move(Mower mower, Action action) {
            switch (action) {
                case L -> mower.setOrientation(N);
                case R -> mower.setOrientation(S);
                case A -> mower.getPosition().incrementX();
            }
        }
    },
    W {
        @Override
        public void move(Mower mower, Action action) {
            switch (action) {
                case L -> mower.setOrientation(S);
                case R -> mower.setOrientation(N);
                case A -> mower.getPosition().decrementX();
            }
        }
    },
    S {
        @Override
        public void move(Mower mower, Action action) {
            switch (action) {
                case L -> mower.setOrientation(E);
                case R -> mower.setOrientation(W);
                case A -> mower.getPosition().decrementY();
            }
        }
    };

    public abstract void move(Mower mower, Action action);
}
