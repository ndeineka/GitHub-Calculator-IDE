package app;

public class Main {
    static int a = 8;
    static int b = 2;
    static int c;
    static int d;
    static int e;
    static int f;

    public static void main(String[] args) {
        System.out.println("My app for Users!");
        System.out.println("Version 1.0");

        c = add(a, b);
        System.out.println(c);

        d = multiply(a, b);
        System.out.println(d);

        e = subtrack(a, b);
        System.out.println(e);

        f = divide(a, b);
        System.out.println(f);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtrack(int a, int b) {
        return a - b;
    }
    private static int divide(int a, int b) {
        return a / b;
    }
}
