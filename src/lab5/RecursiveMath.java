package lab5;

public class RecursiveMath {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int power(int n, int m) {
        if (m <= 1) {
            return n;
        }
        return power(n, m-1);
    }

    public static int summation(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + summation(n-1);
    }

    public static int GCD(int n, int m) {
        // Math.max finds the larger of two numbers
        // Math.min finds the smaller of two numbers
        int LARGER = Math.max(n, m);
        int SMALLER = Math.min(n, m);
        // SMALLER would be the remainder of 0 in this case
        // Which means we found the GCD
        if (SMALLER <= 0) {
            return LARGER; // Return GCD
        }
        // SMALLER is being sent with the remainder
        return GCD(SMALLER,LARGER % SMALLER);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        // We are getting the last two numbers before n
        return fibonacci(n-1) + fibonacci(n-2);
    }

    //TODO: Simple menu for the above methods in a different class
}

