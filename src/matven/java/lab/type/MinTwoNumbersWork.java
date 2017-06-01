package matven.java.lab.type;

import java.util.Scanner;

/**
 * Ввести с клавиатуры два числа, и вывести на экран минимальное из
 * них (Поиск минимума выполняется в функции).
 *
 * @author Artem Matveychuk
 */
public class MinTwoNumbersWork {
    public static void main(String[] args) {
        // прочитать вводимые данные
        Scanner in = new Scanner(System.in);

        System.out.print("Введите a: ");
        int a = in.nextInt();

        System.out.print("Введите b: ");
        int b = in.nextInt();

        System.out.format("Минимальное число: %d", min(a,b));
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }
}
