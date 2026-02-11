package UDEMY_WORKSHOP;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int number =1;
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        
        while(guess != number){
            System.out.print("guess Try again: ");
            guess = sc.nextInt();


        }
        System.out.println("you guessed it right!");

    }
    
}
