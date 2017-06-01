package matven.java.lab.array;

/**
 * Создайте массив из всех чётных чисел от 2 до 20 и выведите
 * элементы массива на экран сначала в строку, отделяя один элемент
 * от другого пробелом, а затем в столбик (отделяя один элемент от
 * другого началом новой строки).
 * Перед созданием массива подумайте, какого он будет размера.
 *
 * @author Artem Matveychuk
 */
public class PrintEvenNumbersWork {
    public static void main(String[] args) {
        int[] mass = new int[10];

        for (int i = 0, j = 2; i < mass.length; i++, j += 2) {
            mass[i] = j;
            System.out.print(mass[i] + " ");
        }

        System.out.println();

        for (int item : mass) {
            System.out.println(item);
        }
    }
}
