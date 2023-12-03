package Generic;

public class Awesome {
    public <T> void showIt(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Awesome awesome = new Awesome();

        // Example with Integer
        awesome.showIt(42);

        // Example with String
        awesome.showIt("Hello, Java!");

        // Example with Boolean
        awesome.showIt(true);
    }
}
