package dev.issam.robots;

public record Pelouse(int width, int height) {
    public Pelouse {
        if (width < 1 || height < 1) {
            throw new IllegalArgumentException("La pelouse doit avoir une taille valide");
        }
    }

    public boolean isInside(int x, int y) {
        boolean isInside = x >= 0;
        isInside &= x <= width;
        isInside &= y >= 0;
        isInside &= y <= height;
        return isInside;
    }
}
