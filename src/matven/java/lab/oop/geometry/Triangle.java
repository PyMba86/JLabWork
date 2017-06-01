package matven.java.lab.oop.geometry;

/**
 * В этой программе демонстрируется ... (кто знает ?)
 *
 * @author Artem Matveychuk
 */
public class Triangle {


    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Площадь треугольника
     */
    public double square() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * Периметр треугольника
     */
    public double perimeter()
    {
        Circle circle = new Circle(0,0,0);
        circle.length();
        return a + b + c;
    }


    public boolean isTriangle() {
        return perimeter()>0;
    }

    /**
     * Длины сторон
     */
    private int a;
    private int b;
    private int c;
}
