@FunctionalInterface
interface GameLogic {
    void play();
}

public abstract class GuestPlayer {
    protected String name;
    protected int score;

    public GuestPlayer(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void incrementScore(int points) {
        score += points;
    }


    public void performGame(GameLogic gameLogic) {
        gameLogic.play();
    }
    public void rule() {
        System.out.println("Welcome to Hangman!");
        System.out.println("Try to guess the word by guessing one letter at a time.");
        System.out.println("You have 6 chances to guess the word correctly.");
        System.out.println("Let's start the game!");
    }

    // Abstract method to be implemented by subclasses
    public abstract void playGame();
}
