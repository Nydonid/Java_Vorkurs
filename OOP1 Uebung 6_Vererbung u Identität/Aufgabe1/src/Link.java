public class Link extends Element {
    Element target;

    public Link (String name, Element target) {
        super(name);
        this.target = target;
    }
    @Override
    public long getSize () {
        return 4000;
    }
    public Element getTarget () {
        return target;
    }
    public void accept (FileSystemVisitor visitor) {
        visitor.visit(this);
        visitor.leave(this);
    }
}
