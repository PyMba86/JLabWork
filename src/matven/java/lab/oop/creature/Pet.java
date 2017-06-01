package matven.java.lab.oop.creature;

/**
 * TODO description and add methods
 */
public abstract class Pet {

    public enum Sex {
        Man,
        Female
    }

    protected float weight;
    protected Sex sex;
    protected int age;

    protected boolean hungry;
    private String name;

    public abstract void voice();
}
