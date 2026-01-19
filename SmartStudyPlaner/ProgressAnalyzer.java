public class ProgressAnalyzer {

    StudyManager manager;

    public ProgressAnalyzer(StudyManager manager) {
        this.manager = manager;
    }

    public String generateReportHTML() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < manager.subjects.size(); i++) {
            int total = manager.totalHours.get(i);
            int completed = manager.completedHours.get(i);
            double progress = (completed * 100.0) / total;

            sb.append("<h3>").append(manager.subjects.get(i)).append("</h3>");
            sb.append("<progress value='").append(progress).append("' max='100'></progress>");
            sb.append("<p>").append(progress).append("%</p>");
        }
        return sb.toString();
    }
}
