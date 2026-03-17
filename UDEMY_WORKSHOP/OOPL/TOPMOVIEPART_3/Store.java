package UDEMY_WORKSHOP.OOPL.TOPMOVIEPART_3;

public class Store {

    Movie movies[];

    public Store() {
        this.movies = new Movie[10];
    }

    public Movie getMovie(int index) {
        return new Movie(this.movies[index]);   
    }

    public void setMovie(int index, Movie movie) {
        this.movies[index] = new Movie(movie);  
    }
}
