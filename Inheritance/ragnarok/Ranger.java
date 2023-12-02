package Inheritance.ragnarok;

public class Ranger extends Character {
    private int attackPower;
    private String rangerClassName;
    private String skillName;

    // Constructor
    public Ranger(String name, int level, int attackPower, String rangerClassName, String skillName) {
        // Call the superclass constructor using super
        super(name, level);

        // Initialize the subclass-specific property
        this.attackPower = attackPower;
        this.rangerClassName = rangerClassName;
        this.skillName = skillName;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public String getRangerClassName() {
        return rangerClassName;
    }

    public String getSpecialSkill() {
        return skillName;
    }
}
