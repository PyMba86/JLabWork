package matven.java.lab.oop.auto.vechicle;

import matven.java.lab.oop.auto.CargoAuto;
import matven.java.lab.oop.auto.PassangersAuto;


public class Pickup implements PassangersAuto, CargoAuto {
    public void transportCargo() {
        System.out.println("Везу груз");
    }
    public void transportPassangers() {
        System.out.println("Везу пассажиров");
    }
}
