package WorkShop.Day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        validateInput();
    }

    static void validateInput() {
        int i = 0;
        do {
            try {
                grade();
                break;
            } catch (RuntimeException ex) {
                System.out.println("You Input the Invalid Format Data " + (3 - i) + " Time Left");
                i++;
            }
        } while (i < 3);
    }

    static void grade() {
        Scanner sc = new Scanner(System.in);
        try {
            String[] name = new String[3];
            double[] grade = new double[3];

            double max = 0;
            String maxName = "";

            for (int i = 0; i < name.length; i++) {
                System.out.print("Enter Student " + (i + 1) + " Name : ");
                name[i] = sc.next();
                System.out.print("Enter Student" + (i + 1) + " Point : ");
                grade[i] = sc.nextFloat();

                while (grade[i] > 100 || grade[i] < 0) {
                    System.out.println("SCORE IS OVER 100 OR LESS THAN 0");
                    System.out.print("Enter Student" + (i + 1) + " Point : ");
                    grade[i] = sc.nextFloat();
                }

                System.out.println("");
            }

            for (int i = 0; i < grade.length; i++) {
                if (grade[i] > max) {
                    max = grade[i];
                    maxName = name[i];
                }
            }

            System.out.println("Top Point is!!!");
            System.out.println("Name : " + maxName);
            System.out.println("Point : " + max);
            String result = (max >= 80) ? "A" : (max >= 70) ? "B" : (max >= 65) ? "C" : (max >= 55) ? "D" : "F";

            System.out.println("Grade : " + result);
        } catch (InputMismatchException ex) {
            throw new InputMismatchException("Invalid input. Please enter a valid number.");
        }
        sc.close();
    }
}
