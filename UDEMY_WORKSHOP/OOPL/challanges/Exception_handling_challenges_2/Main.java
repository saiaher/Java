package UDEMY_WORKSHOP.OOPL.challanges.Exception_handling_challenges_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    static Store store = new Store();

    public static void main(String[] args) {
        try {
            loadMovies("C:\\Sai\\Github\\JAVA\\UDEMY_WORKSHOP\\OOPL\\challanges\\Exception_handling_challenges_2\\movies.txt");
            printStore();
            userInput();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        String status = "continue";

        while (status.equals("continue")) {

            int choice = promptForChoice(scanner);

            try {
                Movie movie = store.getMovie(choice);
                double rating = promptForRating(scanner, movie.getName());

                movie.setRating(rating);
                store.setMovie(choice, movie);

                printStore();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid movie index. Try again.");
            }

            System.out.print("To edit another rating, type: 'continue': ");
            status = scanner.next();
        }

        scanner.close();
    }

    public static int promptForChoice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");

            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice < 0 || choice >= 10) {
                System.out.println("Invalid choice.");
                continue;
            }

            return choice;
        }
    }

    public static double promptForRating(Scanner scanner, String name) {
        while (true) {
            System.out.print("\nSet a new rating for " + name + ": ");

            if (!scanner.hasNextDouble()) {
                scanner.next();
                continue;
            }

            double rating = scanner.nextDouble();

            if (rating < 0 || rating > 10) {
                System.out.println("Rating must be between 0 and 10.");
                continue;
            }

            return rating;
        }
    }

    // ✅ FIXED METHOD
    public static void loadMovies(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);

        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine().trim();

            // ✅ skip empty lines
            if (line.isEmpty()) {
                continue;
            }

            String[] words = line.split("--");

            // ✅ prevent crash
            if (words.length != 3) {
                System.out.println("Skipping bad line: " + line);
                continue;
            }

            try {
                store.addMovie(new Movie(
                        words[0].trim(),
                        words[1].trim(),
                        Double.parseDouble(words[2].trim())
                ));
            } catch (Exception e) {
                System.out.println("Error in line: " + line);
            }
        }

        scanFile.close();
    }

    public static void printStore() {
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.println(store);
    }
}