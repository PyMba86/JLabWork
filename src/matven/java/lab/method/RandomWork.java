package matven.java.lab.method;

/**
 * Создать статический метод, который будет иметь два целочисленных
 * параметра a и b, и в качестве своего значения возвращать случайное
 * целое число из отрезка [a;b].
 *
 * C помощью данного метода заполнить массив из 20 целых чисел
 * и вывести его на экран.
 *
 * @author Artem Matveychuk
 */
public class RandomWork {

    public static void main(String[] args) {
        int[] mas = new int[20];
        for(int i=0; i<mas.length; i++) {
            mas[i] = random(10, 75);
            System.out.print(mas[i]+" ");
        }
    }

    /**
     * Метод получения псевдослучайного целого числа от min до max
     */
    public static int random(int min, int max)
    {
       return (int)(Math.random()*(max-min+1)) + min;
    }
}
