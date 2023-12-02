package Encapsulation;

public class Main {
    // Main method to demonstrate the Squid Game
    public static void main(String[] args) {
        // Creating an instance of the SquidGame class
        SquidGame squidGame = new SquidGame("Manager", "VIP Host 1", 456, 1000000.00);

        // Starting the Squid Game
        squidGame.startGame();

        // Performing a task in the Squid Game
        squidGame.performTask("Red Light, Green Light");

        // Ending the Squid Game
        squidGame.endGame();
    }
}
