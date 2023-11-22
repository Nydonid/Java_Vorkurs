
public class Main {
    public static void main (String[] args) {
        //Generate Test Files
        File helloWorld = new File("hello world.txt", 52090);
        Link start = new Link("Start123", helloWorld);
        Folder mainFolder = new Folder("Main Folder");
        Folder subFolder = new Folder(("Sub Folder"));
        File byeWorld = new File("ByeBye.doc", 86000);
        Link superLink = new Link("SuperLink", subFolder);

        //Add Files To Folder
        mainFolder.addEntry(helloWorld);
        mainFolder.addEntry(start);
        mainFolder.addEntry(subFolder);
        subFolder.addEntry(byeWorld);
        mainFolder.addEntry(superLink);

        //Print
        PrintVisitor printVisitor = new PrintVisitor(System.out);
        mainFolder.accept(printVisitor);


    }
}
