package UDEMY_WORKSHOP;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("\n**** ROYAL BANK OF JAVA ****\n");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your sevings amount: ");
        double savings = sc.nextDouble();

        System.out.println("enter your debt amount : ");
        double debt = sc.nextDouble();

        System.out.println("enter your experence in year :");
        int experience = sc.nextInt();

        if(savings >= 10000 && debt <= 5000 && experience >= 2){
            System.out.println(name + "eligicvle for loan");
        } else {
            System.out.println(name + " not eligicvle for loan");
        }

    }
    
}
