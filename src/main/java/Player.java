public class Player {
    private String username;
    private String password;
    private int credits;
    private float balance;

    public Player(String username, String password) {
        this.username = username;
        this.password = password;
        this.credits = 1000;
    }
}
