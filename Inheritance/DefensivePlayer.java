package Inheritance;

public class DefensivePlayer extends ParentPlayer {

    public DefensivePlayer(String code, String food, String tasks) {
        super(code, food, tasks);
    }

    // Implementing a different playing strategy for aggressive players
    @Override
    public void playStrategy() {
        System.out.println("DEFENSIVE");
        System.out.println("Code: " + getCode());
        System.out.println("Food: " + getFood());
        System.out.println("Tasks: " + getTasks());
    }
}