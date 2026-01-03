public class DiceProject {

        
    public static void main(String[] args) {
        System.out.println("Dice Project Started");
    }

    static void rollDice() {
        int dice1 = (int)(Math.random() * 6) + 1;
        int dice2 = (int)(Math.random() * 6) + 1;
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        System.out.println("Total: " + (dice1 + dice2));

        rollDice();
    }
}
