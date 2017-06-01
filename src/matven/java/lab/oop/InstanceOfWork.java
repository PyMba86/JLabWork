package matven.java.lab.oop;

import matven.java.lab.oop.creature.Lamp;
import matven.java.lab.oop.creature.Pet;
import matven.java.lab.oop.creature.animal.*;

/**
 * Написать метод, который определяет, объект какого класса ему
 * передали, и выводит на экран одну из надписей: Кошка, Собака,
 * Птица, Лампа.
 *
 * @author Artem Matveychuk
 */
public class InstanceOfWork {
    public static void solution(Object object){
        if (object instanceof Cat) System.out.println("Это кошка");
        if (object instanceof Dog) System.out.println("Это собака");
        if (object instanceof Bird) System.out.println("Это птица");
        if (object instanceof Lamp) System.out.println("Это лампа");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Dog",1, Pet.Sex.Man,2);
        solution(dog);
    }
}
