public class LibraryBookSystem {
    public static void main(String[] args) {
        Book3 ranjis = new Book3("Ranjis","Siddhu",200,true);
        ranjis.borrow();
    }
}
class Book3{
    private String title;
    private String author;
    private int price;
    private boolean availability;

    public Book3(String title,String author , int price , boolean availability){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    public void borrow(){
        if(availability)
            System.out.println("Yes you can borrow the book");
        else
            System.out.println("No book is not available right now");
    }
}
