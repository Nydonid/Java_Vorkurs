import java.util.ArrayList;
import java.util.Collections;

public class AnimalFarm {
    ArrayList <Animal> animalsListInDaHaus = new ArrayList<>(); //Erstellung ArrayList AnimalFarm

    public void add(Animal a) {
        animalsListInDaHaus.add(a);
    }
    public void add() {
        for (Animal a : animalsListInDaHaus) {
            System.out.println(a);
        }
    }
    public void printAnimals() {
        for (Animal animal : animalsListInDaHaus) {
            System.out.println("_____________________");
            animal.getName();
            animal.getWeight();
        }
    }
    public void ringBell() {
        for (Animal animal : animalsListInDaHaus) {
            animal.speak();
        }
    }
    public void printOrder() {
        double catFood=0;
        double dogFood=0;

        for (Animal animal : animalsListInDaHaus) {
            if (animal instanceof Cat) {
                catFood += animal.getFood();
            } else {
                dogFood += animal.getFood();
            }
        }
        catFood *= 30;
        catFood = Math.ceil(catFood);
        dogFood *= 30;
        dogFood = Math.ceil(dogFood);
        System.out.println("You need " + catFood + " Kg of Cat Food.");
        System.out.println("You need " + dogFood + " Kg of Dog Food.");
    }
    ArrayList <Animal> animalsSortedName = animalsListInDaHaus; //Erstellung ArrayList Sorted Name
    ArrayList <Animal> animalsSortedWeight = animalsListInDaHaus; //Erstellung ArrayList Sorted Name

    public void printAnimalsByName() {

        Collections.sort(animalsSortedName, new AnimalNameComparator());
        for (Animal animal : animalsSortedName) {
            System.out.println("_____________________");
            animal.getName();
        }
    }
    public void printAnimalsByWeight() {
        Collections.sort(animalsSortedWeight, new AnimalWeightComparator());
        for (Animal animal : animalsSortedWeight) {
            System.out.println("_____________________");
            animal.getWeight();
        }
    }

}
