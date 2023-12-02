package Abstraction;

public class SquidGame implements TaskPerformer {
    // Variables (attributes)
    private String frontman;
    private String vipHost;
    private int numberOfPlayers;
    private double money;

    // Constructor
    public SquidGame(String frontman, String vipHost, int numberOfPlayers, double money) {
        this.frontman = frontman;
        this.vipHost = vipHost;
        this.numberOfPlayers = numberOfPlayers;
        this.money = money;
    }

    // Method to start the Squid Game
    public void startGame() {
        System.out.println("Squid Game has started!");
        System.out.println("Frontman: " + frontman);
        System.out.println("VIP Host: " + vipHost);
        System.out.println("Number of Players: " + numberOfPlayers);
        System.out.println("Initial Money: $" + money);
    }

    // Implementing the abstracted method from the interface
    @Override
    public void performTask(String task) {
        // Abstracted task execution
        System.out.println("Performing task: " + task);
        // Other high-level logic
        System.out.println("Task completed!");
    }

    // Method to end the Squid Game
    public void endGame() {
        System.out.println("Squid Game has ended!");
        // Logic to conclude the Squid Game
    }

}
