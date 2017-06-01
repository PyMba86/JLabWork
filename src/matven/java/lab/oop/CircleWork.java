package matven.java.lab.oop;

import matven.java.lab.oop.geometry.Circle;

import java.util.Scanner;

/**
 * В этой программе демонстрируется применение класса Circle
 * - создание
 * - перемещение
 * - вычисления расстояния
 * - проверка касания в одной точке
 * - вычисление длины окружности
 *
 * @author Artem Matveychuk
 */
public class CircleWork {
    public static void main(String[] args) {
        Circle mainCircle = new Circle(0, 0, 1);

        // Длина окружности
        System.out.println(mainCircle.length());

        // Перемещение
        mainCircle.moveRandom();
        System.out.println(mainCircle);

        // прочитать вводимые данные
        Scanner in = new Scanner(System.in);

        System.out.print("Введите x,y через пробел: ");
        int x = in.nextInt();
        int y = in.nextInt();

        System.out.print("Введите радиус: ");
        int r = in.nextInt();

        Circle testCircle = new Circle(x, y, r);

        // Вычисление расстояния
        testCircle.moveRandom();
        System.out.println(mainCircle.distance(testCircle));

        // Проверка касания
        if (mainCircle.isTouchWith(testCircle))
            System.out.println("Касаются");
        else
            System.out.println("Не касаются");

    }
}
