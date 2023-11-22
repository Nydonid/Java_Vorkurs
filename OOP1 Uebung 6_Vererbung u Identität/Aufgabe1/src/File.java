public class File extends  Element {
    long size;

    public File (String name, long size) {
        super(name);
        this.size = size;
    }
    @Override
    public long getSize () {
        return size;
    }
    public void accept (FileSystemVisitor visitor) {
        visitor.visit(this);
        visitor.leave(this);
    }
}
