package LibraryMangement;

public class Book {
    private String title;
    private int publicationYear;
    private Author author;

    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }
    public void displayInfo(){
        System.out.println("Book title : "+title+" publication year: "+publicationYear+ " BCE");
        author.displayInfo();
    }

}
