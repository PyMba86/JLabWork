package matven.java.lab.time;

/**
 * Выясните экспериментальном путём, начиная с какого элемента
 * последовательности Фибоначчи,вычисление с использованием рекурсии
 * становится неприемлемым (занимает более минуты по времени)
 *
 * @author Artem Matveychuk
 */
public class FibonachiWork {

    public static void main(String[] args) {
        long diffTime = 0;
        int i = 1;

        /*
         * Измерение времени выполнения
         * 60000 - 1 минута
         */
        while (diffTime < 60000) {
            long startTime = System.currentTimeMillis();
            System.out.format("[%d] %d%n", i, fibonacci(i++));
            diffTime = System.currentTimeMillis() - startTime;
        }
        System.out.format("Это было очень долго и мучительно: %d", i);
    }

    public static long fibonacci(int n) {
        if (n < 2) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
