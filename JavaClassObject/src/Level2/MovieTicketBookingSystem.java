import java.util.Scanner;

public class MovieTicketBookingSystem {
    public static void main(String[] args){
        MovieTicket war = new MovieTicket("The war");
        war.bookTicket();
        war.displayTicket();
    }
}

class MovieTicket{
    private String movieName;
    private String seatNumber;
    private int price;

    public MovieTicket(String movieName){
        this.movieName = movieName;
    }
    public void bookTicket(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the seat number");
        seatNumber = sc.next().trim();
        System.out.println("Enter the price of the ticket");
        price = sc.nextInt();
        System.out.println("Ticket Booked!!");
    }
    public void displayTicket(){
        System.out.println("Movie name: "+movieName);
        System.out.println("Seat Number: "+seatNumber);
        System.out.println("Price of Ticket: "+price);
    }

}