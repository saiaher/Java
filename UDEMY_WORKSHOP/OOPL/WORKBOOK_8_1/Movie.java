package UDEMY_WORKSHOP.OOPL.WORKBOOK_8_1;

public class Movie {

    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " | " + format + " | " + rating;
    }
}