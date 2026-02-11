package UDEMY_WORKSHOP;

import java.util.Scanner;

public class CountingTool {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number you want to count up to");
        long number = sc.nextLong();



        for(int i = 0; i <= number; i++){
            System.out.print(i + " ");
        }
    }
    
}
