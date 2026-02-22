package UDEMY_WORKSHOP;

public class HighScore {

    public static void main(String[] args) {
        
        int[] scores = {100, 90, 80, 70, 60};

        int high_score = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > high_score) {
                high_score = scores[i];
            }
        }

        System.out.println("The highest score is: " + high_score);
    }
    
}
