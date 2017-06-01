package matven.java.lab.oop;

import matven.java.lab.oop.creature.Pet;
import matven.java.lab.oop.creature.animal.*;

/**
 * Написать три класса: Pet(домашнее животное) - с полями вес, пол,
 * возраст, Cat(кот) с полем имя и Dog(собака) с полем имя.
 * Унаследовать кота и собаку от животного. В классах кот и собака
 * реализовать методы вывода информации и о животных
 *
 * @author Artem Matveychuk
 */
public class PetWork {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom",6, Pet.Sex.Man,2);
        Dog dog = new Dog("Mia",12, Pet.Sex.Female,1);

        System.out.println(cat);
        System.out.println(dog);
    }
}
