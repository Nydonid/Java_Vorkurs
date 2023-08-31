// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        AnimalFarm animalList = new AnimalFarm();   //zum Hinzufügen der Tiere mit .add zu animalListInDaHaus
            animalList.add( new Cat("Mephisto", 7.5));
            animalList.add( new Cat("Luna", 4.5));
            animalList.add( new Cat("Nova", 4.7));
            animalList.add( new Dog("Rex", 35));
            animalList.add( new Dog("Chica", 2.7));
            animalList.add( new Dog("Brutus", 75));

            //animalList.printAnimals();       //Übung 3 Animal Farm

            //animalList.ringBell();           //Übung 4 Sprechende Tiere

            //animalList.printOrder();         //Übung 5 Tierfutter bestellen

            animalList.printAnimalsByName();   //Übung 6 Sortierte Ausgabe
            animalList.printAnimalsByWeight(); //Übung 6 Sortierte Ausgabe


    }
}