package matven.java.lab.oop;

import matven.java.lab.oop.creature.*;
import matven.java.lab.oop.creature.animal.*;

/**
 * Написать четыре класса: Fish(Рыбы), Animal(Животные),
 * Ape(Обезьяны), Human(Человек).
 * Унаследовать животных от рыб, обезьян от животных и человека
 * от обезьян. Поля и методы разработать самостоятельно.
 *
 * @author Artem Matveychuk
 */
public class AnimalWork {
    public static void main(String[] args) {

        System.out.println("Fish:");
        Fish fish = new Animal();
        fish.swim(50);

        System.out.println("Ape:");
        Ape ape = new Ape();
        ape.eat();
        ape.eat();


        System.out.println("Human:");
        Human human = new Human();
        human.eat();
        human.swim(30);
        human.run();

    }
}
