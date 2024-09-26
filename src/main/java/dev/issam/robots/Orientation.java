package dev.issam.robots;

public enum Orientation {
    N {
        @Override
        public void move(Tondeuse tondeuse, Action action) {
            switch (action) {
                case G -> tondeuse.setOrientation(W);
                case D -> tondeuse.setOrientation(E);
                case A -> tondeuse.getPosition().incrementY();
            }
        }
    },
    E {
        @Override
        public void move(Tondeuse tondeuse, Action action) {
            switch (action) {
                case G -> tondeuse.setOrientation(N);
                case D -> tondeuse.setOrientation(S);
                case A -> tondeuse.getPosition().incrementX();
            }
        }
    },
    W {
        @Override
        public void move(Tondeuse tondeuse, Action action) {
            switch (action) {
                case G -> tondeuse.setOrientation(S);
                case D -> tondeuse.setOrientation(N);
                case A -> tondeuse.getPosition().decrementX();
            }
        }
    },
    S {
        @Override
        public void move(Tondeuse tondeuse, Action action) {
            switch (action) {
                case G -> tondeuse.setOrientation(E);
                case D -> tondeuse.setOrientation(W);
                case A -> tondeuse.getPosition().decrementY();
            }
        }
    };

    public abstract void move(Tondeuse tondeuse, Action action);
}
