package matven.java.lab.method;

import java.util.Arrays;

/**
 * Создать метод, который будет выводить указанный массив на экран в строку.
 * С помощью созданного метода и метода из предыдущей задачи заполнить
 * 5 массивов из 10 элементов каждый случайными числами и вывести
 * все 5 массивов на экран, каждый на отдельной строке.
 *
 * @author Artem Matveychuk
 */
public class PrintArrayWork {

    public static void main(String[] args) {

        int mass[][] = new int[5][10];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = RandomWork.random(1, 100);
            }
            printArray(mass[i]);
        }
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
