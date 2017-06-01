package matven.java.lab.oop.creature.animal;

import matven.java.lab.oop.creature.Pet;

/**
 * Created by pymba86 on 19.05.17.
 */
public class Snake extends Pet {

    public Snake(float weight, Sex sex, int age) {
        this.weight = weight;
        this.sex = sex;
        this.age = age;
    }

    public void voice() {
        System.out.println("Snake");
    }
}