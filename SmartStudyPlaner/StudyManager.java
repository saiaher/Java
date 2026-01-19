import java.util.ArrayList;

public class StudyManager {

    public ArrayList<String> subjects = new ArrayList<>();
    public ArrayList<Integer> totalHours = new ArrayList<>();
    public ArrayList<Integer> completedHours = new ArrayList<>();

    public void addStudy(String subject, int total, int completed) {
        subjects.add(subject);
        totalHours.add(total);
        completedHours.add(completed);
    }
}
