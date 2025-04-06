public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book2 b1 = new Book2("5233523-123423-32523","Muski","Piya ji");
        Book2.setLibraryName("cg-library");
        Book2.displayLibraryName();
        b1.getDetails();
        if(b1 instanceof Book2){
            System.out.println("Yes b1 is instance of Book2");
        }
    }
}
class Book2{
    private static String libraryName;
    private final String isbn;
    private String title;
    private String author;
    public Book2(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    public static void setLibraryName(String newLibraryName){
        libraryName = newLibraryName;
    }
    public static void displayLibraryName(){
        System.out.println("Library name : "+libraryName);
    }

    public void getDetails(){
        System.out.println("Book title: "+title);
        System.out.println("Author : "+author);
        System.out.println("ISBN name : "+isbn);
    }

}
