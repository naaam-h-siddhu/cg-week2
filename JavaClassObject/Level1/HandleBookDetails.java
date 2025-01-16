import org.w3c.dom.html.HTMLImageElement;

public class HandleBookDetails {
    public static void main(String[] args){
        Book book1 = new Book("The world's end","Sudhakar Sing",599);
        book1.getData();
    }
}
class Book{
    private String title;
    private String author;
    private int price;
    public Book(String title, String author , int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void getData(){
        System.out.println("Book name: "+title+"\nAuthor name: "+author+"\nPrice of the book: "+price);
    }
}
