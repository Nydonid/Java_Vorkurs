public class Circle implements Shape {
    int centerX;
    int centerY;
    int radius;
    int color;
    Circle (int centerX, int centerY, int radius, int color) {
        super();
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.color = color;
    }
    public int getRadius() {
        return radius;
    }

    @Override
    public int getX() {
        return centerX;
    }

    @Override
    public int getY() {
        return centerY;
    }

    @Override
    public void move(int deltaX, int deltaY) {
        centerX += deltaX;
        centerY += deltaY;
    }

    @Override
    public int getAreaColor() {
        return color;
    }

    @Override
    public void draw(Visualization visualization) {
        visualization.drawCircle(centerX, centerY, radius, color);
    }
}
