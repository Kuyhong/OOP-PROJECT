public class Ticket {
    int ticketID;
    Showtime showtime;
    Movie movie;
    Hall hall;
    Seat seat;
    double price;
    String bookingStatus;

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
