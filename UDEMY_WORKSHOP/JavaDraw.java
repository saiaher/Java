package UDEMY_WORKSHOP;
import java.util.Scanner;

public class JavaDraw {

    public static void main(String[] args) {
        System.out.println("1 for butterfly");
        System.out.println("2 for elephant");
        System.out.println("3 for bear");
        System.out.println("4 for snake");


        System.out.println("enter which animal you can drow");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("  .==-.                   .-==.     ");
                System.out.println("   \\()8`-._  `.   .'  _.-'8()/     ");
                System.out.println("   (88\"   ::.  \\./  .::   \"88)     ");
                System.out.println("    \\_.'`-::::.(#).::::-'`._/      ");
                System.out.println("      `._... .q(_)p. ..._.'         ");
                System.out.println("        \"\"-..-'|=|`-..-\"\"       ");
                System.out.println("        .\"\"' .'|=|`. `\"\".       ");
                System.out.println("      ,':8(o)./|=|\\.(o)8:`.        ");
                System.out.println("     (O :8 ::/ \\_/ \\:: 8: O)      ");
                System.out.println("      \\O `::/       \\::' O/       ");
                System.out.println("       \"\"--'         `--\"\"      ");
                
                break;

            case 2:
                System.out.println("       _..--\"\"-.                  .-\"\"--.._ ");
                System.out.println("   _.-'         \\ __...----...__ /         '-._");
                System.out.println(" .'      .:::...,'              ',...:::.      '.");
                System.out.println("(     .'``'''::;                  ;::'''``'.     )");
                System.out.println(" \\             '-)              (-'             /");
                System.out.println("  \\             /                \\             /");
                System.out.println("   \\          .'.-.            .-.'.          /");
                System.out.println("    \\         | \\0|            |0/ |         /");
                System.out.println("    |          \\  |   .-==-.   |  /          |");
                System.out.println("     \\          `/`;          ;`\\`          /");
                System.out.println("      '.._      (_ |  .-==-.  | _)      _..'");
                System.out.println("          `\"`\"-`/ `/'        '\\` \\`-\"`\"`");
                System.out.println("               / /`;   .==.   ;`\\ \\");
                System.out.println("         .---./_/   \\  .==.  /   \\ \\");
                System.out.println("        / '.    `-.__)       |    `\"");
                System.out.println("       | =(`-.        '==.   ;");
                System.out.println("        \\  '. `-.           /");
                System.out.println("         \\_:_)   `\"--.....-'");    

                break;

            case 3:
                
                System.out.println("            ___   .--. ");
                System.out.println("      .--.-\"   \"-' .- |");
                System.out.println("     / .-,`          .'");
                System.out.println("     \\   `           \\");
                System.out.println("      '.            ! \\");
                System.out.println("        |     !  .--.  |");
                System.out.println("        \\        '--'  /.____");
                System.out.println("       /`-.     \\__,'.'      `\\");
                System.out.println("    __/   \\`-.____.-' `\\      /");
                System.out.println("    | `---`'-'._/-`     \\----'    _");
                System.out.println("    |,-'`  /             |    _.-' `\\");
                System.out.println("   .'     /              |--'`     / |");
                System.out.println("  /      /\\              `         | |");
                System.out.println("  |   .\\/  \\      .--. __          \\ |");
                System.out.println("   '-'      '._       /  `\\         /");
                System.out.println("               `\\    '     |------'`");
                System.out.println("                 \\  |      |");
                System.out.println("                  \\        /");
                System.out.println("                   '._  _.'");
                System.out.println("                      ``");

                break;
            
            case 4:
                System.out.println("         /^\\/^\\");
                System.out.println("       _|__|  O|");
                System.out.println("\\/     /~     \\_/ \\");
                System.out.println(" \\____|__________/  \\");
                System.out.println("        \\_______      \\");
                System.out.println("                `\\     \\                 \\");
                System.out.println("                  |     |                  \\");
                System.out.println("                 /      /                    \\");
                System.out.println("                /     /                       \\\\");
                System.out.println("              /      /                         \\ \\");
                System.out.println("             /     /                            \\  \\");
                System.out.println("           /     /             _----_            \\   \\");
                System.out.println("          /     /           _-~      ~-_         |   |");
                System.out.println("         (      (        _-~    _--_    ~-_     _/   |");
                System.out.println("          \\      ~-____-~    _-~    ~-_    ~-_-~    /");
                System.out.println("            ~-_           _-~          ~-_       _-~   ");
                System.out.println("               ~--______-~                ~-___-~");
                
                break;
                

        
            default:

                System.out.println("Invalid choice");
                break;
        }

        


        
    }
    
}
