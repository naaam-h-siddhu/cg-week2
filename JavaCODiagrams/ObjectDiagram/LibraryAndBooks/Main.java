package LibraryAndBooks;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library("Central Library");
        Book b1 = new Book("abc", "xyz");
        Book b2 = new Book("dgf", "gdgd");
        Book b3 = new Book("adg", "gfg");
        Book b4 = new Book("fsdds", "fdsfsd");

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        lib.addBook(b4);
        lib.getBooks();
    }
}
