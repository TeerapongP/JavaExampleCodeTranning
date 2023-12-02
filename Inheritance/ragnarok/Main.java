package Inheritance.ragnarok;

public class Main {
    public static void main(String[] args) {
        // Create a paladin
        Paladin paladin = new Paladin("Hero", 50, 5000, "Paladin", "Cannon Spear");
        Warlock warlock = new Warlock("Jorin", 50, 3500, "Warlock", "Meteor Storm");
        Ranger ranger = new Ranger("Jorin", 50, 3500, "Ranger", "Arrow Storm");

        // Access properties using methods from the superclass and subclass
        System.out.println("Class: " + paladin.getPaladinClassName());
        System.out.println("Name: " + paladin.getName());
        System.out.println("Level: " + paladin.getLevel());
        System.out.println("Attack Power: " + paladin.getAttackPower());
        System.out.println("Special skill: " + paladin.getSpecialSkill());
        System.out.println("\n");

        System.out.println("Class: " + warlock.getWarlockClassName());
        System.out.println("Name: " + warlock.getName());
        System.out.println("Level: " + warlock.getLevel());
        System.out.println("Attack Power: " + warlock.getAttackPower());
        System.out.println("Special skill: " + warlock.getSpecialSkill());
        System.out.println("\n");

        System.out.println("Class: " + ranger.getRangerClassName());
        System.out.println("Name: " + ranger.getName());
        System.out.println("Level: " + ranger.getLevel());
        System.out.println("Attack Power: " + ranger.getAttackPower());
        System.out.println("Special skill: " + ranger.getSpecialSkill());
    }
}
