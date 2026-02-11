package UDEMY_WORKSHOP;

public class Beer {
    public static void main(String[] args) {

        for (int i = 99; i >= 1; i--){
            Sing(i);
        }
        
    }

    static void Sing(int number) {
        System.out.println(number + " bottles of beer on the wall, " + number + " bottles of beer!");
        System.out.println("Take one down and pass it around, " + (number - 1) + " bottles of beer on the wall.");
    }
    
}

