package matven.java.lab.oop.creature.animal;

/**
 * TODO add description -> PegasWork
 *
 * @author Artem Matveychuk
 */
public class Pegas extends Horse {

    public Pegas(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(this.getName() + " is fly!");
    }
}
