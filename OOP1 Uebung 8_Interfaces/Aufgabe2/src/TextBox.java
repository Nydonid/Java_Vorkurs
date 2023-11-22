public class TextBox extends Rectangle implements Text {
    String text;
    int textColor;
    TextBox(int left, int top, int width, int height, int areaColor, String text, int textColor) {
        super(left, top, width, height, areaColor);
        this.text = text;
        this.textColor = textColor;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public int getTextColor() {
        return textColor;
    }
    @Override
    public void draw(Visualization visualization) {
        super.draw(visualization);
        var textX = getX() + getWidth() / 2;
        var textY = getY() + getHeight() / 2;
        visualization.drawText(textX, textY, text, textColor);
    }
}
