package matven.java.lab.array;

/**
 * Создать двумерный массив из 7 строк по 4 столбца в каждой из
 * случайных целых чисел из отрезка [-5;5]. Вывести массив на экран.
 * Определить и вывести на экран индекс строки с наибольшим по
 * модулю произведением элементов. Если таких строк несколько,
 * то вывести индекс первой встретившейся из них.
 *
 * @author Artem Matveychuk
 */
public class IndexLineInArrayWork {
    public static void main(String[] args) {
        int[][] mass = new int[7][4];
        int max = 0;
        int index = 0;
        for (int i = 0; i < mass.length; i++) {
            int multiply = 1;
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 11) - 5;
                System.out.print(mass[i][j] + " ");
                multiply *= Math.abs(mass[i][j]);
            }
            System.out.println();
            if (multiply > max) {
                max = multiply;
                index = i;
            }
        }
        System.out.println("Строка с наибольшем произведием элементов: " + max + ", имеет индекс " + index);
    }
}