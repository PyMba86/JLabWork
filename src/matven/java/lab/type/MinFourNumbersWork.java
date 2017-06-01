package matven.java.lab.type;

import java.util.Scanner;

/**
 * Написать метод, который вычисляет минимум из четырёх чисел.
 * Метод min(a,b,c,d) должен использовать метод min(a,b).
 *
 * @author Artem Matveychuk
 */
public class MinFourNumbersWork {
    public static void main(String[] args) {
        // прочитать вводимые данные
        Scanner in = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        int a = in.nextInt();

        System.out.print("Введите 2 число: ");
        int b = in.nextInt();

        System.out.print("Введите 3 число: ");
        int c = in.nextInt();

        System.out.print("Введите 4 число: ");
        int d = in.nextInt();

        // вывод
        System.out.format("Минимальное число: %d", min(a,b,c,d));
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int min(int a, int b, int c, int d) {
        return min(min(a,b),min(c,d));
    }
}
