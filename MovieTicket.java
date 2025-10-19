public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName, String seatNumber, double price){
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket(String newSeatNumber, double newPrice){
        this.seatNumber = newSeatNumber;
        this.price = newPrice;
        System.out.println("Tickets booked/updated successfully.");
    }
    public void display(){
        System.out.println("Ticket deatils:");
        System.out.println("Movie name : " + movieName);
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args){
        MovieTicket ticket1 = new MovieTicket("Spy Family", "F06", 200);

        ticket1.display();
        System.out.println();


        
    }
}
