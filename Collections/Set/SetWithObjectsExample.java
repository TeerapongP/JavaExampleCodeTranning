package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class SetWithObjectsExample {
    public static void main(String[] args) {
        // Create a HashSet of Book objects
        Set<Book> bookSet = new HashSet<>();

        // Add books to the set
        Book book1 = new Book("Atomic Habits: Tiny changes, Remarkable Results", "James Clear");
        Book book2 = new Book("Sherlock Holmes", "Arthur Conan Doyle");

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling"));

        // Print the set using enhanced for loop
        System.out.println("Set elements:");
        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
}
