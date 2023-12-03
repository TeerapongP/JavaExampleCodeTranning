package Generic;

public class Main {
    public static void main(String[] args) {

        // Create an instance of SimpleStorage with Integer type parameter
        SimpleStorage<Integer> s1 = new SimpleStorage<>();
        s1.Value = 55;

        // Create an instance of SimpleStorage with String type parameter
        SimpleStorage<String> s2 = new SimpleStorage<>();
        s2.Value = "Hello world";

        // Create an instance of SimpleStorage with Boolean type parameter
        SimpleStorage<Boolean> s3 = new SimpleStorage<>();
        s3.Value = false;

        // Print the values
        System.out.println("s1.Value: " + s1.Value);
        System.out.println("s2.Value: " + s2.Value);
        System.out.println("s3.Value: " + s3.Value);
    }
}
