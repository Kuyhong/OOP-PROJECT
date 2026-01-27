public class Ticket {
    private int ticketID;
    private Showtime showtime;
    private Movie movie;
    private Hall hall;
    private Seat seat;
    private double price;
    private String bookingStatus;

    public Ticket (int ticketID, Showtime showtime, Movie movie, Hall hall, Seat seat, double price, String bookingstatus){
        this.ticketID = ticketID;
        this.showtime = showtime;
        this.movie = movie;
        this.hall = hall;
        this.seat = seat;
        this.price = price;
        this.bookingStatus = bookingstatus;
    }
}
