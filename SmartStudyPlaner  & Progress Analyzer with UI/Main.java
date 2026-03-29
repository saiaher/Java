
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudyManager manager = new StudyManager();
        ProgressAnalyzer analyzer = new ProgressAnalyzer(manager);

        while (true) {
            System.out.println("\n=== Smart Study Planner & Progress Analyzer ===");
            System.out.println("1. Add Study Details");
            System.out.println("2. View Study Details");
            System.out.println("3. Analyze Progress");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter subject name: ");
                    String subject = sc.nextLine();

                    System.out.print("Enter total study hours: ");
                    int total = sc.nextInt();

                    System.out.print("Enter completed study hours: ");
                    int completed = sc.nextInt();

                    manager.addStudy(subject, total, completed);
                    System.out.println("Study details added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- Study Details ---");
                    for (int i = 0; i < manager.subjects.size(); i++) {
                        System.out.println("Subject: " + manager.subjects.get(i));
                        System.out.println("Total Hours: " + manager.totalHours.get(i));
                        System.out.println("Completed Hours: " + manager.completedHours.get(i));
                        System.out.println("---------------------");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Progress Report ---");
                    for (int i = 0; i < manager.subjects.size(); i++) {
                        int t = manager.totalHours.get(i);
                        int c = manager.completedHours.get(i);
                        double progress = (c * 100.0) / t;

                        System.out.println("Subject: " + manager.subjects.get(i));
                        System.out.println("Progress: " + progress + "%");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
