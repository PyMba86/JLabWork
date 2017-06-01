package matven.java.lab.method;

/**
 * TODO description add math method
 */
public class OverloadWork {

    public static void main(String[] args) {
        print(1);
        print((Integer) 1);
    }

    public static void print(Integer n) {
        System.out.println("print(Integer)");
    }

    public static void print(int n) {
        System.out.println("print(int)");
    }

    public static void print(String string) {
        System.out.println("print(String)");
    }

    public static void print(char c) {
        System.out.println("print(a,b)");
    }

    public static void print(double x) {
        System.out.println("print(a,b,c)");
    }

    public static void print(byte n) {
        System.out.println("print(float)");
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static long min(long a, long b) {
        return (a < b) ? a : b;
    }

    public static double min(double a, double b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return 0;
    }

    public static long max(long a, long b) {
        return 0;
    }

    public static double max(double a, double b) {
        return 0;
    }
}
