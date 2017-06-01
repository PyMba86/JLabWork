package matven.java.lab.type;

/**
 * Используя цикл for вывести на экран прямоугольный треугольник из
 * восьмёрок со сторонами 10 и 10.
 * Пример:
 * 8
 * 88
 * 888
 *
 * @author Artem Matveychuk
 */
public class DrawTriangleWork {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = i; 0 <= j; j--) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
