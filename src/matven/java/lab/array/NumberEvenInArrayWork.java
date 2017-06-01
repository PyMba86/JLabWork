package matven.java.lab.array;

import java.util.Random;

/**
 * Создайте массив из 15 случайных целых чисел из отрезка [0;9].
 * Выведите массив на экран.
 * Подсчитайте сколько в массиве чётных элементов и выведете это
 * количество на экран на отдельной строке.
 *
 * @author Artem Matveychuk
 */
public class NumberEvenInArrayWork {
    public static void main(String[] args) {

        int[] numbers = new int[15];
        int evenNumbersCount = 0;
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10); // случайные числа в промежутке от 0 до 9.
            System.out.println(numbers[i]);
            if ((numbers[i] % 2 == 0) && (numbers[i] != 0)) {
                evenNumbersCount++;
            }
        }
        System.out.println("Количество четных чисел в массиве: " + evenNumbersCount);
    }
}
