package Inheritance;

public class DefensivePlayer extends ParentPlayer {
    // Implementing a different playing strategy for aggressive players
    @Override
    public void playStrategy() {
        System.out.println("DEFENSIVE");
        System.out.println("Code: " + getCode());
        System.out.println("Food: " + getFood());
        System.out.println("Tasks: " + getTasks());
    }
}