public class BookLibrarySystem {
    public static void main(String[] args) {
        Book4 red = new Book4(9748386, "Red Hand");
        red.setAuthor("Siddhu");
        red.getAuthor();
        Ebook eRed = new Ebook(878389,"Red Hand Ebook",212);
        eRed.getDetails();
    }
}
class Book4{
    public int isbn;
    protected String title;
    private String author;

    public Book4(int isbn,String title){
        this.isbn = isbn;
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void getAuthor(){
        System.out.println("Name of Author: "+author);
    }

}
class Ebook extends Book4{
    private int pages;
    public Ebook(int isbn, String title, int pages){
        super(isbn,title);
        this.pages = pages;

    }
    public void getDetails(){
        // Accessing public and protected members
        System.out.println("ISBN : "+isbn);
        System.out.println("Title of book : "+title);
        System.out.println("Number of Pages : "+pages);
    }
}
