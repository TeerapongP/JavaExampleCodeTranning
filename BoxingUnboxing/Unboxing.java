package BoxingUnboxing;

public class Unboxing {
    public static void main(String[] args) {

        Integer wrapperInt = 42;
        int primitiveInt = wrapperInt.intValue(); // Unboxing

        Double wrapperDouble = 42.12;
        double primitiveDouble = wrapperDouble.doubleValue();
    }
}
