package SmartStudyProgress;

public class ProgressAnalyzer {

    StudyManager manager;

    public ProgressAnalyzer(StudyManager manager) {
        this.manager = manager;
    }

    public void analyzeProgress() {
        System.out.println("\n--- Progress Report ---");

        for (int i = 0; i < manager.subjects.size(); i++) {
            int total = manager.totalHours.get(i);
            int completed = manager.completedHours.get(i);

            double progress = (completed * 100.0) / total;

            System.out.println("Subject: " + manager.subjects.get(i));
            System.out.println("Progress: " + progress + "%");

            if (progress < 40) {
                System.out.println("Status: Poor");
            } else if (progress < 60) {
                System.out.println("Status: Average");
            } else if (progress < 80) {
                System.out.println("Status: Good");
            } else {
                System.out.println("Status: Excellent");
            }

            System.out.println("----------------------");
        }
    }
}
