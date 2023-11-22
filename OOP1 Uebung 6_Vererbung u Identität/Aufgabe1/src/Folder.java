import java.util.ArrayList;

public class Folder extends Element {
    ArrayList<Element> entries = new ArrayList<>();

    public Folder (String name) {
        super(name);
    }
    public void addEntry (Element entry) {
        entries.add(entry);
    }
    @Override
    public long getSize () {
        long folderSize = 0;
        for (Element entry : entries) {
            folderSize += entry.getSize();
        }
        return folderSize;
    }
    public void accept (FileSystemVisitor visitor) {
        visitor.visit(this);
        for (Element entry : entries) {
            entry.accept(visitor);
        }
        visitor.leave(this);
    }
}
