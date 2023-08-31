import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    HashMap <String, String> dictionary = new HashMap<String, String>();
    public void put(String de, String en) {
        dictionary.put(de, en);
    }
    public void toEnglish(String de) {

        System.out.println(dictionary.get(de));
    }
}


