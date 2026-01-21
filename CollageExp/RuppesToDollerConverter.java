package CollageExp;

import java.util.Scanner;

public class RuppesToDollerConverter {

  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in Rupees: ");
        double rs = sc.nextDouble();

        double rate = 83.50; 
        double dollar = rs / rate;

        System.out.println(rs + " Rupees = " + dollar + " Dollar");



        

       
    }
}

    

