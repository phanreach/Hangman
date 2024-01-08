public class RegisterPlayer extends GuestPlayer {

    public RegisterPlayer(String name, int score) {
        super(name, score);
    }

    @Override
    public void rule() {
        super.rule();  // Call the superclass rule method if needed
        System.out.println("Welcome " + this.name + " to the game ");
    }

    @Override
    public void playGame() {
        super.rule();  // Include the generic rules provided by GuestPlayer
        System.out.println("Playing the game as a registered user...");
    }
}
