package Statements;

import java.util.*;

public class StatementExample {
    private static final int basePrice1 = 80;
    private static final int basePrice2 = 70;
    private static final int basePrice3 = 60;
    private static final double memberDiscount = 0.1;

    public static void main(String[] args) {

        int customerInput = readCustomer();
        int[] numShirts = new int[customerInput];
        customerOrder(numShirts);
        String[] memberChecks = new String[customerInput];
        memberChecks_(memberChecks);
        calculateTotalPrice(numShirts, memberChecks);
    }

    static int readCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of users: ");
        int numCustomers = 0;

        try {
            numCustomers = Integer.parseInt(scanner.nextLine());
            while (numCustomers < 0) {
                System.out.println("Error: Invalid input. Please input a positive number.");
                System.out.print("Input number of users: ");
                numCustomers = Integer.parseInt(scanner.nextLine());
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException(e.getMessage());
        }
        return numCustomers;

    }

    static void customerOrder(int[] numShirts) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numShirts.length; i++) {
            System.out.println("How many shirts will you order?");
            System.out.print("Customer " + (i + 1) + " : ");
            int numShirt = 0;
            try {
                numShirt = Integer.parseInt(scanner.nextLine());
                while (numShirt < 0) {
                    System.out.println("Error: Invalid input. Please input a positive number.");
                    System.out.print("Customer " + (i + 1) + " : ");
                    numShirt = Integer.parseInt(scanner.nextLine());
                }
            } catch (NumberFormatException e) {
                throw new NumberFormatException(e.getMessage());
            }
            numShirts[i] = numShirt;
        }
    }

    static void memberChecks_(String[] memberChecks) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < memberChecks.length; i++) {
            System.out.println("Do you have a member card (y/n)?");
            System.out.print("Customer " + (i + 1) + " : ");
            String memberCheck = "";

            while (!memberCheck.equals("y") && !memberCheck.equals("n")) {
                memberCheck = scanner.nextLine();
                if (!memberCheck.equals("y") && !memberCheck.equals("n")) {
                    System.out.println("Error: Invalid input. Please input either 'y' or 'n'.");
                    System.out.print("Customer " + (i + 1) + " : ");
                }
            }
            memberChecks[i] = memberCheck;
        }
    }

    static void calculateTotalPrice(int[] numShirts, String[] memberChecks) {

        double totalPriceAllCustomers = 0;

        for (int i = 0; i < numShirts.length; i++) {

            int numShirt = numShirts[i];
            String memberCheck = memberChecks[i];
            double totalPrice = 0;
            double discountPrice = 0;
            if (numShirt < 100) {
                totalPrice = numShirt * basePrice1;
            } else if (numShirt < 250) {
                totalPrice = numShirt * basePrice2;
            } else {
                totalPrice = numShirt * basePrice3;
            }
            if (memberCheck.equals("y")) {
                discountPrice = totalPrice * memberDiscount;
                totalPrice *= (1 - memberDiscount);
            }
            totalPriceAllCustomers += totalPrice;
            System.out.println("-------------- OUTPUT CUSTOMER " + (i + 1) + " --------------");
            System.out.println("Customer " + (i + 1) + " orders is : " + numShirt + " item.");
            System.out
                    .println(
                            "The customer " + (i + 1) + " has a membership card ? " + ": " + memberCheck.toUpperCase());
            System.out.println("Total price for customer " + (i + 1) + ": " + totalPrice + " Baht.");
            System.out.println("Discount price for customer " + (i + 1) + ": " + discountPrice + " Baht.");
            System.out.println("----------------------------------------------");
        }
        System.out.println("Total price all customer : " + totalPriceAllCustomers + " Baht.");
    }
}
