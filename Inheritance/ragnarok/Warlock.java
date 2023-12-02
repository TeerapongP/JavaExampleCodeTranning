package Inheritance.ragnarok;

public class Warlock extends Character {
    private int attackPower;
    private String warlockClassName;
    private String skillName;

    // Constructor
    public Warlock(String name, int level, int attackPower, String warlockClassName, String skillName) {
        // Call the superclass constructor using super
        super(name, level);

        // Initialize the subclass-specific property
        this.attackPower = attackPower;
        this.warlockClassName = warlockClassName;
        this.skillName = skillName;
    }

    // Getter method for attackPower
    public int getAttackPower() {
        return attackPower;
    }

    public String getWarlockClassName() {
        return warlockClassName;
    }

    public String getSpecialSkill() {
        return skillName;
    }
}
