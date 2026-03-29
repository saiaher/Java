package UDEMY_WORKSHOP.OOPL.PRACTICE_2.PART_2;

import java.util.ArrayList;



public class Store {

     private ArrayList<Book> books;


    public Store() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public Book getBook(int index) {
        return this.books.get(index);
    }
}    
     
     
