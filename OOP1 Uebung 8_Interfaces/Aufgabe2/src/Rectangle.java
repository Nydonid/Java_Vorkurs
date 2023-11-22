public class Rectangle implements Shape {
    int left;
    int top;
    int width;
    int height;
    int color;
    Rectangle(int left, int top, int width, int height, int color){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    void resize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getX() {
        return left;
    }

    @Override
    public int getY() {
        return top;
    }

    @Override
    public void move(int deltaX, int deltaY) {
        left += deltaX;
        top += deltaY;
    }

    @Override
    public int getAreaColor() {
        return color;
    }

    @Override
    public void draw(Visualization visualization) {
        visualization.drawRectangle(left, top, width, height, color);
    }
}
