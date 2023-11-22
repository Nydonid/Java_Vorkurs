import java.io.PrintStream;

public class PrintVisitor extends FileSystemVisitor {
    private final PrintStream printStream;
    public PrintVisitor(PrintStream output) {
        this.printStream = output;
    }
    int indentationLevel;
    private void printIndentation() {
        for (int i = 0; i < indentationLevel; i++) {
            printStream.append("   ");
        }
    }
    @Override
    public void visit(File file) {
        printIndentation();
        printStream.println(file.getName() + (" (" + file.getSize() + " bytes) "));
    }
    @Override
    public void visit(Link link) {
        printIndentation();
        printStream.println(link.getName() + " -> " + link.target.name + (" (" + link.getSize() + " bytes) "));
    }
    @Override
    public void visit(Folder folder) {
        printIndentation();
        printStream.println(folder.getName() + (" (" + folder.getSize() + " bytes) "));
        indentationLevel++;
    }
    public void leave(File file) {
    }
    @Override
    public void leave(Link link) {
    }
    @Override
    public void leave(Folder folder) {
        indentationLevel--;
    }
    @Override
    public String toString() {
        return printStream.toString();
    }

}
