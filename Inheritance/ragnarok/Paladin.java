package Inheritance.ragnarok;

// Paladin class, inheriting from Character
public class Paladin extends Character {
    private int attackPower;
    private String paladinClassName; // Corrected the type and name of className
    private String skillName; // Corrected the type and name of className

    // Constructor
    public Paladin(String name, int level, int attackPower, String paladinClassName, String skillName) {
        // Call the superclass constructor using super
        super(name, level); // Corrected the argument passed to super

        // Initialize the subclass-specific property
        this.attackPower = attackPower;
        this.paladinClassName = paladinClassName;
        this.skillName = skillName;
    }

    // Getter method for attackPower
    public int getAttackPower() {
        return attackPower;
    }

    public String getPaladinClassName() {
        return paladinClassName;
    }

    public String getSpecialSkill() {
        return skillName;
    }
}
