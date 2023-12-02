package Statements.LoopStatement;

public class LoopExample {
    public static void main(String[] args) {
        // Loop: for
        System.out.println("Using a for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // Loop: while
        System.out.println("\nUsing a while loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Number: " + j);
            j++;
        }

        // Loop: do-while
        System.out.println("\nUsing a do-while loop:");
        int k = 1;
        do {
            System.out.println("Number: " + k);
            k++;
        } while (k <= 5);
    }
}
