package java4ftc;
import java.math.BigInteger;

public class DwFactorial {
    public static void main(String[] args) {
        
        BigInteger factorial = BigInteger.ONE; 
        for (int i = 1 ; i <= 100 ; i++)
     {
        factorial = factorial.multiply(BigInteger.valueOf(i)) ;
        System.out.println("Factorial of " + i + " is: " + factorial);
     }

    }
    
}
