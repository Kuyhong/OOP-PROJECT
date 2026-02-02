public class Ticket {
    int ticketID;
    Showtime showtime;
    Seat seat;

    public Ticket (int ticketID, Showtime showtime, Seat seat){
        this.ticketID = ticketID;
        this.showtime = showtime;
        this.seat = seat;
    }

    public void print_Ticket(){
        System.out.println("Ticket ID: " + ticketID);
        System.out.println("Movie title: " + showtime.movie.title);
        System.out.println("Duration: " + showtime.movie.duration + " mins");
        System.out.println("Hall: " + showtime.hall.hallID);
        System.out.println("Seat number: " + seat.seatID);
    }


}
