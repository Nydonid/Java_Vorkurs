public class Title implements Printable {
    private String titleText;
    public Title (String title) {
        titleText = title.toUpperCase();
    }
    public void print() {
        System.out.println(titleText);
    }
}
