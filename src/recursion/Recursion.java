package recursion;

public class Recursion {
    public static void main(String[] args) {
//        counter(5);
//        System.out.println(factorial(5));
        System.out.println(fibonacci(46));
    }

    private static void counter(int i) {
        if (i == 0)
            return;

        System.out.println(i);
        counter(i - 1);
    }

    private static int factorial(int i) {
        if (i == 1)
            return 1;

        return i * factorial(i - 1);

    }

    private static int fibonacci(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }

    }
}
