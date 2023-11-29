
public class oldmanPolymorphism {

    public static void main(String[] args) {

        // Create objects of different roles
        Oldman creator = new Creator();
        Oldman player = new Player();
        Oldman host = new Host();

        // Use polymorphism to call show method on different roles using the utility
        OldmanUtility.ShowRoleOldMan(host);
        OldmanUtility.ShowRoleOldMan(creator);
        OldmanUtility.ShowRoleOldMan(player);
    }
}
