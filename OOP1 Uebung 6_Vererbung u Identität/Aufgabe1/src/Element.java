public abstract class Element {
    protected String name;
    public Element (String name) {
        this.name = name;

    }
    public String getName () {
        return name;
    }
    public abstract long getSize();
    public abstract void accept (FileSystemVisitor visitor);
}
