public class BookReports {
    public static void main(String[] args) {
        Books b1 = new Books();
        b1.getter();
        System.out.println();
        Books b2 = new Books("Holy shit","Nepo",200);
        b2.getter();
    }
}

class Books{
    private String title;
    private String author;
    private int price;
    public Books(){
        title = "Default title";
        author = "Default author";
        price = 10000;
    }
    public Books(String title,String author , int price){
        this.title = title;
        this.author = author;
        this.price = price;

    }
    public void getter(){
        System.out.println("Title of book: "+title);
        System.out.println("Author of book: "+author);
        System.out.println("Price of book: "+price);
    }
}