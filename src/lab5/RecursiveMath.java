package lab5;
/**
 * Class for recursive math functions
 * @author Jorge Luis Pabon
 * @version 1.0
 */
public class RecursiveMath {
    /**
     * Calculates factorial of a number
     * @param num number to facotorial
     * @return factorial of n
     */
    public int factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    /**
     * Calculates power of a number
     * @param num base
     * @param power exponent
     * @return base raised to exponent
     */
    public int pow(int num, int power) {
        if (power == 0) {
            return 1;
        }
        return num * pow(num, power - 1);
    }

    /**
     * Calculates summation from 1 to n 
     * @param num number to sum to
     * @return summation result
     */
    public int summation(int num) {
        if (num == 1) {
            return 1;
        }
        return num + summation(num - 1);
    }

    /**
     * Calculates greatest common divisor
     * @param a first input number
     * @param b second input number
     * @return greatest common divisor
     */
    // Euclidean Algorithm
    public int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

    /**
     * Calculates Fibonacci
     * @param num number to start fibonacci
     * @return fibonacci result
     */
    public int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
