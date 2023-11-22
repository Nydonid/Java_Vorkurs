import javax.naming.directory.InvalidAttributesException;
import java.util.Arrays;

public class concat {
    public static void main (String[] args) throws InvalidAttributesException {
            String[] a = {"Hallo", "Claude", "du", "Heini"};
        String txt = concat(a);
        System.out.println(txt);
    }
    static String concat (String[] a) throws InvalidAttributesException {
        String txt ="";
        if (a.length <=2) {
            System.out.println("ERROR");
            throw new InvalidAttributesException("ERROR. A has to contain more than 2 Strings. ");
        }
        for (int i=0; i<a.length; i++) {
           txt = txt +" " + a[i] ;
       }
        txt = txt +".";
        return txt;
    }
}
