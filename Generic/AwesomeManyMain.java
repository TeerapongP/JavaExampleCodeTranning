package Generic;

public class AwesomeManyMain {
    public static void main(String[] args) {
        AwesomeMany<Integer, String> example = new AwesomeMany<>();

        example.setValue1(42);
        example.setValue2("Hello, World!");

        System.out.println("Value1: " + example.getValue1());
        System.out.println("Value2: " + example.getValue2());
    }
}
