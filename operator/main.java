package operator;

public class main {
    public static void main(String args[]) {
        int a, b;
        a = 10;
        b = 5;
        b = (b == 1) ? 20 : 30;
        System.out.println("Value of b is : " + b);

        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is : " + b);
    }
}
