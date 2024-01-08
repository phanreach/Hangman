public class User {
    private String username;
    private String password;
    private String email;

    public User(String username) {
        this.username = username;
        this.password = null;
        this.email = null;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.email = null;
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public String getEmail(){
        return email;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String tmp = "This user name : " + this.username + " The password is "+ this.password ;
        return tmp;
    }
}