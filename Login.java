import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your email: ");
        String email= scanner.nextLine();
        System.out.println("Please enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();

        if (Authentication.authenticateUser(username, password,email)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Login failed.");
        }

        scanner.close();
    }
}