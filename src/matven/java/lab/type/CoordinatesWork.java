package matven.java.lab.type;

import java.util.Scanner;

/**
 * Ввести с клавиатуры два целых числа, которые будут координатами
 * точки, не лежащей на координатных осях OX и OY. Вывести на
 * экран номер координатной четверти, в которой находится
 * данная точка.
 *
 * @author Artem Matveychuk
 */
public class CoordinatesWork {
    public static void main(String[] args) {
        // прочитать вводимые данные
        Scanner in = new Scanner(System.in);

        System.out.print("Введите a: ");
        int a = in.nextInt();

        System.out.print("Введите b: ");
        int b = in.nextInt();

        if (a > 0 && b > 0) {
            System.out.println("1");
        } else if (a < 0 && b > 0) {
            System.out.println("2");
        } else if (a < 0 && b < 0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}
