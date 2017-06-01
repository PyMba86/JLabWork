package matven.java.lab.oop.creature.animal;

import matven.java.lab.oop.creature.Pet;

/**
 * TODO description and add methods
 */
public class Cat extends Pet {


    public Cat(String name, float weight, Sex sex, int age) {
        this.name = name;
        this.weight = weight;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return String.format("Кошка -> Имя: %s%nВес: %f%nПол: %s%nВозраст: %d%n", name, weight, sex.toString(), age);
    }

    private String name;

    @Override
    public void voice() {
        System.out.println("Cat");
    }
}
