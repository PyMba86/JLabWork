package matven.java.lab.type;

import java.util.Scanner;

/**
 * Ввести с клавиатуры два числа m и n.
 * Используя цикл for вывести на экран прямоугольник размером m на n
 * из восьмёрок.
 * Пример: m=2, n=4
 * 8888
 * 8888
 *
 * @author Artem Matveychuk
 */
public class DrawRectangleWork {
    public static void main(String[] args) {
        // прочитать вводимые данные
        Scanner in = new Scanner(System.in);

        System.out.print("Введите m: ");
        int m = in.nextInt();

        System.out.print("Введите n: ");
        int n = in.nextInt();

        // вывод матрицы размером m*n из 8
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
