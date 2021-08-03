package gadingpackage.application;

import gadingpackage.data.Animal;
import gadingpackage.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        

        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();

    }
}
