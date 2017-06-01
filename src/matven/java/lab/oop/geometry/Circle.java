package matven.java.lab.oop.geometry;

import matven.java.lab.method.RandomWork;

/**
 * В этой классе демонстрируется создание методов и перегрузка
 * конструтора
 *
 * @author Artem Matveychuk
 */
public class Circle {

    /**
     * Тут что то пишут :)
     * Наверное, это очень важное :D
     */
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * Длина окружности
     */
    public double length() {
        return 2 * Math.PI * radius;
    }

    /**
     * Расстояние между центрами двух окружностей
     */
    public double distance(Circle other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    /**
     * Проверка на касание другой окружности в одной точке
     */
    public boolean isTouchWith(Circle other) {
        return Math.abs(this.radius - other.radius) == this.distance(other);
    }

    /**
     * Перемещение центра круга в случайную точку квадрата
     * координатной плоскости с диагональю от [-99;-99] до [99;99].
     */
    public void moveRandom() {
        this.x = RandomWork.random(-99, 99);
        this.y = RandomWork.random(-99, 99);
    }

    public String toString() {
        return String.format("Центр: [%d,%d]  Радиус: %d",x,y,radius);
    }

    // Абсцисса центра
    private int x;

    // Ордината центра
    private int y;

    // Радиус
    private int radius;

}
