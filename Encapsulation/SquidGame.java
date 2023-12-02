package Encapsulation;

public class SquidGame {

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

    // Method to perform a task in the Squid Game
    public void performTask(String task) {
        System.out.println("Performing task: " + task);
        // Logic to perform the task
        System.out.println("Task completed!");
    }

    // Method to end the Squid Game
    public void endGame() {
        System.out.println("Squid Game has ended!");
        // Logic to conclude the Squid Game
    }

    // Getter and setter methods for encapsulation
    public String getFrontman() {
        return frontman;
    }

    public void setFrontman(String frontman) {
        this.frontman = frontman;
    }

    public String getVipHost() {
        return vipHost;
    }

    public void setVipHost(String vipHost) {
        this.vipHost = vipHost;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

}
