package UDEMY_WORKSHOP.OOPL.challanges.Exception_handling_challenges;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    static Store store = new Store();

    public static void main(String[] args) {

        try {
            loadMovies("movies.txt");
            printStore();
            userInput();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void loadMovies(String fileName) throws FileNotFoundException {

        Scanner file = new Scanner(new FileInputStream(fileName));

        while (file.hasNextLine()) {

            String line = file.nextLine();
            String[] parts = line.split("--");

            String name = parts[0];
            String format = parts[1];
            double rating = Double.parseDouble(parts[2]);

            store.addMovie(new Movie(name, format, rating));
        }

        file.close();
    }

    public static void printStore() {
        System.out.println("\n******** MOVIE STORE ********");
        System.out.println(store);
    }

    public static void userInput() {

        Scanner scanner = new Scanner(System.in);
        String status = "continue";

        while (status.equals("continue")) {

            System.out.print("Choose movie index: ");
            int choice = scanner.nextInt();

            // ✅ FIXED: correct object usage
            Movie movie = store.getMovie(choice);

            System.out.print("Enter new rating: ");
            double rating = scanner.nextDouble();

            movie.setRating(rating);

            // ✅ FIXED: correct object usage
            store.setMovie(choice, movie);

            printStore();

            System.out.print("Type 'continue' to continue: ");
            status = scanner.next();
        }

        scanner.close();
    }
}