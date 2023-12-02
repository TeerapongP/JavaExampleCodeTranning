package Inheritance.ragnarok;

// Character class
public class Character {
    private String name;

    private int level;

    // Constructor
    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // Getter methods (you can add more methods as needed)
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }
}
