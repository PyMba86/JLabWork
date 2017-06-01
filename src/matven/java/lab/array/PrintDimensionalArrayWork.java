package matven.java.lab.array;

/**
 * Создать двумерный массив из 8 строк по 5 столбцов в каждой из
 * случайных целых чисел из отрезка [10;99]. Вывести массив на экран.
 *
 * @author Artem Matveychuk
 */
public class PrintDimensionalArrayWork {
    public static void main(String[] args) {
        int[][] mass = new int[8][5];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                int k = (int) (Math.random() * 90) + 10;
                mass[i][j] = k;
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
