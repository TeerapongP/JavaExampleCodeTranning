package Exception;

import java.util.Scanner;

public class NumberException {
    public static void main(String[] args) {
        validateNumber();
    }

    static void validateNumber() {
        int i = 0;
        do {
            try {
                readInputNumber();
                break; // Break the loop if input is valid
            } catch (RuntimeException ex) {
                System.out.println("You're wrong!!! " + "You can input " + (3 - i) + " more times.");
            }
            i++;
        } while (i < 4); // Change to 3 since you want to allow 3 attempts
    }

    static void readInputNumber() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter Number : ");
            int inputNum = scanner.nextInt();

            if (inputNum > 0) {
                System.out.println(inputNum + " is a positive number");
            } else if (inputNum < 0) {
                System.out.println(inputNum + " is a negative number");
            } else {
                throw new NumberFormatException(inputNum + " is zero number");
            }
        } catch (java.util.InputMismatchException ex) {
            throw new RuntimeException("Invalid input. Please enter a valid number.");
        }
        scanner.close(); // Ensure the scanner is closed
    }
}
