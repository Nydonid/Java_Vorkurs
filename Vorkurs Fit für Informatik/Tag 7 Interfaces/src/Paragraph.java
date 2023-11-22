public class Paragraph implements Printable{
    private String content;
    public Paragraph (String content1) {
        content = content1;
    }
    public void print() {
        System.out.println(content);
    }
}
