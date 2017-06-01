package matven.java.lab.method;

import java.util.Arrays;
import java.util.List;

/**
 * Создать метод, который будет сортировать указанный массив по
 * возрастанию любым известным вам способом.
 *
 * @author Artem Matveychuk
 */
public class SortArrayWork {

    /**
     * Сортировка пузырьком в порядке возрастания
     */
    public static int[] bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int numbers[] = {11, 5, 9, 6, 17, 8, 1, 5};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
