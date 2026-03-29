package UDEMY_WORKSHOP.OOPL.PRACTICE_2;

public class Book {

    private String title;
    private String author;
    private double rating;
    private double price;


    public Book(String title, String author, double rating, double price) {
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.price = price;
    }

    public Book(Book b1){
        this.title = b1.title;
        this.author = b1.author;
        this.rating = b1.rating;
        this.price = b1.price;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    


    
}
