package Generic;

public class AwesomeReturnType {
    public <T> T showIt(T value) {
        return value;
    }

    public static void main(String[] args) {
        AwesomeReturnType awesomeReturnType = new AwesomeReturnType();

        // Example with Integer
        Integer intValue = awesomeReturnType.showIt(42);
        System.out.println("Returned value: " + intValue);

        // Example with String
        String stringValue = awesomeReturnType.showIt("Hello, Java!");
        System.out.println("Returned value: " + stringValue);

        // Example with Boolean
        Boolean boolValue = awesomeReturnType.showIt(true);
        System.out.println("Returned value: " + boolValue);
    }
}
