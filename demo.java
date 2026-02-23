import java.util.InputMismatchException;
import java.util.Scanner;

public class demo {

static void run(int a,int b) {
    System.out.println("Calculation Result:");
    try {
        System.out.println(a/b);
    } catch (Exception e) {
        // TODO: handle exception
    }
}

static void show() {
    System.out.println("Demo class show method");
}


public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
        boolean success = false;
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        run(number1,number2);
        show();
        // while (!success) {
        //      try {
        //         System.out.print("Please enter a number: ");
        //         int number = scanner.nextInt(); // This will fail if you type a String
                
        //         System.out.println("Success! You entered: " + number);
        //          // Exit the loop
        //         int array[] = {10, 20, 30, 40, 50};
                
        //         System.out.println("Accessing array element: " + array[6]);
        //         success = true;
                
        //     } catch (Exception e) {
        //         System.out.println("Error: That wasn't a number. Please try again." );
        //         e.printStackTrace();
        //         scanner.nextLine(); // CRITICAL: Clear the "bad" input from the scanner buffer
        //     }
        // }
        // scanner.close();

}
}
