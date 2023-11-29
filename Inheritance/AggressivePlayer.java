package Inheritance;

public class AggressivePlayer extends ParentPlayer {

    public AggressivePlayer(String dressCode, String food, String tasks) {
        super(dressCode, food, tasks);
    }

    // Implementing a different playing strategy for aggressive players
    @Override
    public void playStrategy() {
        System.out.println("AGGRESSIVE");
        System.out.println("Code: " + getCode());
        System.out.println("Food: " + getFood());
        System.out.println("Tasks: " + getTasks());
    }
}
