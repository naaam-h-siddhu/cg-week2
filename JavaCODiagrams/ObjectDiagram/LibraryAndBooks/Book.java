package LibraryAndBooks;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void getBookDetails(){
        System.out.println("Name: "+title);
        System.out.println("Author: "+author);
        System.out.println();
    }

}
