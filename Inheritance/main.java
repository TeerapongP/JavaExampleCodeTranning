package Inheritance;

public class main {

    public static void main(String[] args) {

        DefensivePlayer defensivePlayer = new DefensivePlayer();
        AggressivePlayer aggressivePlayer = new AggressivePlayer();

        // Modify properties using setter methods
        defensivePlayer.setCode("056");
        defensivePlayer.setFood("Healthy diet");
        defensivePlayer.setTasks("Guard the base");

        aggressivePlayer.setCode("101");
        aggressivePlayer.setFood("Protein");
        aggressivePlayer.setTasks("Attacker");

        // Invoke methods
        defensivePlayer.playStrategy();
        System.out.println("\n");
        aggressivePlayer.playStrategy();
    }
}
