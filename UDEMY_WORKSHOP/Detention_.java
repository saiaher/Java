package UDEMY_WORKSHOP;
import java.util.Scanner;

public class Detention_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what you want to write enter that line.");

        String line = sc.nextLine();

        
        for(int i = 0; i<99; i++){
            System.out.println(i+1 + ". " + line);
        }
    }
    
}
