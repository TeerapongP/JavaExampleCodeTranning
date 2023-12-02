package WrapperClass;

public class WrapperClass {
    public static void main(String[] args) {
        int primitiveInt = 42;
        Integer wrappedInt = Integer.valueOf(primitiveInt);

        double primitiveDouble = 3.14;
        Double wrappedDouble = Double.valueOf(primitiveDouble);

        boolean primitiveBoolean = true;
        Boolean wrappedBoolean = Boolean.valueOf(primitiveBoolean);

        char primitiveChar = 'A';
        Character wrappedChar = Character.valueOf(primitiveChar);

        System.out.println("WrappedInt : " + wrappedInt);
        System.out.println("WrappedDouble : " + wrappedDouble);
        System.out.println("WrappedBoolean : " + wrappedBoolean);
        System.out.println("WrappedChar : " + wrappedChar);
    }
}
