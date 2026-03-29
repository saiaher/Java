package UDEMY_WORKSHOP.OOPL.PRACTICE_2 .PART_2;

public class Main {
    public static void main(String[] args) {
    Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99);
    Book book2 = new Book("1984", "George Orwell", 4.17, 12.99);



    Store store = new Store();
    store.addBook(book1);
    store.addBook(book2);
    System.out.println(store.getBook(0).getTitle() );
    System.out.println(store.getBook(0).getAuthor() );
    System.out.println(store.getBook(0).getRating() );
    System.out.println(store.getBook(0).getPrice() );
    System.out.println(store.getBook(1).getTitle() );
    System.out.println(store.getBook(1).getAuthor() );          
    System.out.println(store.getBook(1).getRating() );
    System.out.println(store.getBook(1).getPrice() );
        
    
    }


}
