import java.util.ArrayList;

public class    TomatoTest {
    public static void main (String[] args) {

        //Testprogramm

        Tomato tom = new Tomato("Tom", 14, "rot");
        tom.speak();

        Tomato tim = new Tomato("Tim", 17, "orange");
        tim.speak();

        System.out.println("Price" + tim.getPrice());

        Tomato tamara = new Tomato("Tamara", 172, "rot");

        System.out.println(tamara);



        ArrayList<Tomato> list = new ArrayList<>();
        list.add(tom);
        list.add(tim);
        list.add(tamara);

        for (Tomato t : list) {
            System.out.println(t);
        }
    }
}
