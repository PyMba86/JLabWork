package matven.java.lab.oop.creature.animal;

import matven.java.lab.oop.creature.Pet;

/**
 * TODO description
 */
public class Dog extends Pet {

    public Dog(String name, float weight, Pet.Sex sex, int age) {
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

    public String toString() {
        return String.format("Собака -> Имя: %s%nВес: %f%nПол: %s%nВозраст: %d%n",name,weight,sex.toString(),age);
    }

    public void getChild(){
        System.out.println("родился щенок!");
    }

    private String name;

    public void voice() {
        System.out.println("Dog");
    }
}
