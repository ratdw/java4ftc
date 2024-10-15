package java4ftc;
public class FizzBuzz {
    public static void main(String[] args) {
        for (int num = 0; num <= 100; num++){
            if (num % 3 == 0 && num % 5 == 0){
                System.out.println("FizzBuzz") ;

            } else if (num % 5 == 0) {
                System.out.println("Buzz") ;
            } else if (num % 3 == 0) {
                System.out.println("Fizz") ;
            } else {
                String numToString = String.valueOf(num);
                numToString = numToString.replace("3", "Fizz");
                System.out.println(numToString);
            } 

        }
   } 
}






