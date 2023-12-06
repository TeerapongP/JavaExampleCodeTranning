package WorkShop;

import java.util.Scanner;

public class Ws2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Using if-else statement
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }

    private static int calculateFactorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * calculateFactorial(n - 1);
    }
}
