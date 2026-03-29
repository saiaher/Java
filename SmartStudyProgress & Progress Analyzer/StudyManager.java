package SmartStudyProgress;


import java.util.ArrayList;
import java.util.Scanner;

public class StudyManager {
    Scanner sc = new Scanner(System.in);

    ArrayList<String> subjects = new ArrayList<>();
    ArrayList<Integer> totalHours = new ArrayList<>();
    ArrayList<Integer> completedHours = new ArrayList<>();

    public void addStudy() {
        System.out.print("Enter subject name: ");
        String subject = sc.nextLine();

        System.out.print("Enter total study hours: ");
        int total = sc.nextInt();

        System.out.print("Enter completed study hours: ");
        int completed = sc.nextInt();

        subjects.add(subject);
        totalHours.add(total);
        completedHours.add(completed);

        System.out.println("Study details added successfully!");
    }

    public void viewStudy() {
        System.out.println("\n--- Study Details ---");
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println("Subject: " + subjects.get(i));
            System.out.println("Total Hours: " + totalHours.get(i));
            System.out.println("Completed Hours: " + completedHours.get(i));
            System.out.println("---------------------");
        }
    }
}
