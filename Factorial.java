package java4ftc;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        BigInteger factorial = BigInteger.ONE; // Start with 1
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                factorial = factorial.multiply(BigInteger.valueOf(j));
            }
            System.out.println("Factorial of " + i + " is: " + factorial);
            factorial = BigInteger.ONE;

        }

    }

}
