package matven.java.lab.type;

/**
 * Используя цикл for вывести на экран чётные числа от 1 до 100
 * включительно. Через пробел либо с новой строки.
 *
 * @author Artem Matveychuk
 */
public class EvenNumbersWork {
    public static void main(String[] args) {
        for (int number = 2; number <= 100; number += 2) {
            System.out.println(number);
        }
    }
}
