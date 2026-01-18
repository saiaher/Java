package SmartStudyProgress;    

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudyManager manager = new StudyManager();
        ProgressAnalyzer analyzer = new ProgressAnalyzer(manager);

        while (true) {
            System.out.println("\n=== Smart Study & Progress Analyzer ===");
            System.out.println("1. Add Study Details");
            System.out.println("2. View Study Details");
            System.out.println("3. Analyze Progress");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manager.addStudy();
                    break;
                case 2:
                    manager.viewStudy();
                    break;
                case 3:
                    analyzer.analyzeProgress();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

