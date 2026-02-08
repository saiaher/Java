package UDEMY_WORKSHOP;

public class JavaMart {

    public static void main(String[] args) {
        double wallet = 100;

        int toy = 20;

        if (wallet >= toy) {
            System.out.println("You can buy the toy");
            wallet -= toy;
        } else {
            System.out.println("You cannot buy the toy");
        }

        int bag = 90;
        if (wallet >= bag) {
            System.out.println("You can buy the bag");
            wallet -= bag;
        } else {
            System.out.println("You cannot buy the bag");
        }

        System.out.println("Remaining " + wallet);
    }
    
}
