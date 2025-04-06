package LibraryMangement;

public class Main {
    public static void main(String[] args) {


        Author author = new Author("Ved Vyash", "He is a central figure in Hinduism and is considered \n \tthe author of the Mahabharata, an epic that includes the Bhagavad Gita");
        Book gita = new Book("Shri Bhagavad Gita", 500, author);
        gita.displayInfo();
    }
}
