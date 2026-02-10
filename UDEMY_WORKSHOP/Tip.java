package UDEMY_WORKSHOP;

public class Tip {
    public static void main(String[] args) {
        double billAmount = 100.0;
        double tipPercentage = 15.0;

        double tipAmount = calculateTip(billAmount, tipPercentage);
        System.out.println("Tip Amount: $" + tipAmount);
    }

    static double calculateTip(double bill, double percentage) {
        return bill * (percentage / 100);
    }
    
}
