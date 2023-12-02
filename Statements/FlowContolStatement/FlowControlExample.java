package Statements.FlowContolStatement;

public class FlowControlExample {
    public static void main(String[] args) {
        // Jump Statement: break
        System.out.println("Using a break statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exit the loop when i is 3
            }
            System.out.println("Number: " + i);
        }

        // Jump Statement: continue
        System.out.println("\nUsing a continue statement:");
        for (int j = 1; j <= 5; j++) {
            if (j == 2 || j == 4) {
                continue; // Skip the loop body when j is 2 or 4
            }
            System.out.println("Number: " + j);
        }
    }
}
