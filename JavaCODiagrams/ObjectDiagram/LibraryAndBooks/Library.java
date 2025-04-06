package LibraryAndBooks;

import java.util.ArrayList;

public class Library {
    private String name;

    ArrayList<Book> books;
    public Library(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void getBooks(){
        for(Book bi : books){
            bi.getBookDetails();
        }
    }
}
