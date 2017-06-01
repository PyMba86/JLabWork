package matven.java.lab.oop;

import matven.java.lab.oop.creature.animal.*;

/**
 * Написать два класса: Horse(лошадь) - в конструкторе задается
 * кличка лошади и Pegas(пегас) - релизующий метод
 * полет(сообщает какая лошадь летит).
 * Унаследовать пегаса от лошади.
 *
 * @author Artem Matveychuk
 */
public class PegasWork {
    public static void main(String[] args) {
        Pegas sportsHorse = new Pegas("Tom");
        sportsHorse.fly();
    }
}
