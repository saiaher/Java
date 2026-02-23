package UDEMY_WORKSHOP.Arrays.Workbook_6_9;

public class Tax {

    public static void main(String[] args){
        int price[] = {100, 120, 150, 200, 250};
        
        double AfterTax[] = new double[price.length];

        for(int i = 0; i < price.length; i++){
            AfterTax[i] = price[i] *( 13.0/100); 
        }

        for(int i = 0; i < AfterTax.length; i++){
            System.out.println("Original Price: " + price[i] + ", After Tax: " + AfterTax[i]);
        }

    } 
    
}
