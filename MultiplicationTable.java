package java4ftc;
public class MultiplicationTable {
    public static void main(String[] args) {
        int size = 10; // You can change this for a larger table

        // Print the header row
        System.out.printf("%-4s", " ");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%-4d", i);
        }
        System.out.println();

        // Print a separator line
        System.out.println("----" + "----".repeat(size));

        // Print the table
        for (int i = 1; i <= size; i++) {
            // Print the header column
            //System.out.printf("%-4d|", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%-4d", i * j);
            }
            System.out.println();
        }
    }
}
