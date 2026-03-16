package UDEMY_WORKSHOP.Project_1;

import java.util.*;

public class Hangman {

    // List of possible words
    public static String[] words = {
        "ant", "baboon", "badger", "bat", "bear",
        "beaver", "camel", "cat", "clam", "cobra"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String word = words[new Random().nextInt(words.length)];
   
        char placeholders[] = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            placeholders[i] = '_';
        }

        int wrongGuesses = 0;
        String missedGuesses = "";

        while (wrongGuesses < 6) {
         
            System.out.println("Word: " + String.valueOf(placeholders));
            System.out.println("Missed guesses: " + missedGuesses);
            System.out.print("Guess a letter: ");
            char guess = sc.next().charAt(0);

            
            boolean correctGuess = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    placeholders[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                missedGuesses += guess + " ";
                wrongGuesses++;
            }

            if (String.valueOf(placeholders).equals(word)) {
                System.out.println("Congratulations! You've won! The word was: " + word);
                break;
            }
        }


        if (wrongGuesses == 6) {
           
            System.out.println("Sorry! You've lost! The word was: " + word);
        }
        sc.close();
    }
}