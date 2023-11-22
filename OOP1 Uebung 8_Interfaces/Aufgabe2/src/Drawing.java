import java.util.List;

public class Drawing {
    private List<Shape> figures;
    private Visualization visualization;
    Drawing (List <Shape> figures, Visualization visualization) {
        this.figures = figures;
        this.visualization = visualization;
    }
    public void draw () {
        visualization.clear();
        for (var figure : figures) {
            figure.draw(visualization);
        }
    }
    public void move(int deltaX, int deltaY) {
        for (var figure : figures) {
            figure.move(deltaX, deltaY);
        }
        draw();
    }
    public void printTexts() {
        for (var figure : figures) {
            if (figure instanceof Text) {
                var text = (Text) figure;
                System.out.println(text.getText());
            }
        }
    }
    public static void main(String[] args) {
        // Sample shows how to directly draw on the visualization board.

        var rect = new Rectangle(10, 10, 100, 80, 0x1f497d);
        var circle = new Circle(130, 60, 40, 0xc0504d);
        var textBox = new TextBox(30, 110, 100, 50, 0x9bbb59, "Hello!", 0x000000);
        var figures = List.of(rect, circle, textBox);
        var visualization = new SwingVisualization();
        var drawing = new Drawing(figures, visualization);
        drawing.move(100, 100);
        drawing.draw();
        drawing.printTexts();
    }
}
