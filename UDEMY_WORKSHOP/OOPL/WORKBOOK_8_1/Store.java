package UDEMY_WORKSHOP.OOPL.WORKBOOK_8_1;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Movie> movies;

    // Task 1
    public Store() {
        movies = new ArrayList<>();
    }

    // Task 2
    public Movie getMovie(int index) {
        return movies.get(index);
    }

    public void setMovie(int index, Movie movie) {
        movies.set(index, movie);
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    // Extra (for printing)
    public void printStore() {
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(i + ": " + movies.get(i));
        }
    }
}
