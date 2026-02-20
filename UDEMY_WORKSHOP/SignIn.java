package UDEMY_WORKSHOP;
import java.util.Scanner;

public class SignIn {

    public static void main(String[] args) {
        String username = "9373036635";
        String password = "Sai@123";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String inputUsername = sc.nextLine();

        System.out.print("Enter your password: ");
        String inputPassword = sc.nextLine();

        while (!inputUsername.equals(username) || !inputPassword.equals(password)) {
            System.out.println("Invalid username or password. Please try again.");
            System.out.print("Enter your username: ");
            inputUsername = sc.nextLine();
            System.out.print("Enter your password: ");
            inputPassword = sc.nextLine();
        }

        System.out.println("Sign-in successful! Welcome.");

        
    
}
}
