package LibraryMangement;

public class Author {
    private String name;
    private String bio;

    public Author(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }
    public void displayInfo(){
        System.out.println("Author Name: "+name+" bio : "+bio);
    }
}

