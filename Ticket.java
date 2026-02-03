public class Ticket {
    int ticketID;
    Showtime showtime;
    Seat seat;

    public Ticket (int ticketID, Showtime showtime, Seat seat){
        this.ticketID = ticketID;
        this.showtime = showtime;
        this.seat = seat;
    }

    public void print_Ticket(Ticket[] tickets, int ticketID){
        System.out.println("Ticket ID: " + tickets[ticketID - 1].ticketID);
        System.out.println("Movie title: " + tickets[ticketID - 1].showtime.movie.title);
        System.out.println("Duration: " + tickets[ticketID - 1].showtime.movie.duration + " mins");
        System.out.println("Hall: " + tickets[ticketID - 1].showtime.hall.hallID);
        System.out.println("Seat number: " + tickets[ticketID - 1].seat.seatID);
    }

}
