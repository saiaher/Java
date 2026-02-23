package UDEMY_WORKSHOP.Arrays.Workbook_6_10;

import java.util.Scanner;

public class PizzaDelivery {


     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] toppings = new String[3];

        for (int i = 0; i < toppings.length; i++) {
            System.out.print((i + 1) + ". Enter a topping: ");
            toppings[i] = scanner.nextLine();
        }

        for (int i = 0; i < toppings.length; i++) {
            System.out.println(toppings[i]);
        }

        scanner.close();
    }

   

    
    
}
