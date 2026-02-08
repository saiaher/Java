package UDEMY_WORKSHOP;

public class AppleStore {
    int numofapples = 100;
    int numofcostomers = 0;
    double profit = 0.0;

    public static void main(String[] args) {
        int price = 2;
        AppleStore as = new AppleStore();
        System.out.println("you pic 500 apples from the store");
        as.numofapples += 500;
        System.out.println("you sold 200 apples to customers");
        as.numofapples -= 200;      
        as.profit += 200 * price;
      
        System.out.println("you have " + as.numofapples + " apples left in the store");
        System.out.println("you have made a profit of ruppes " + as.profit);
        
    

        
        
    }
    
}
