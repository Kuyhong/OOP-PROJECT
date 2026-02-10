public class Ticket {
    private static int ticketCounter = 0;
    private int ticketID;
    private Showtime showtime;
    private double price;
    private int seat_Number;

    public Ticket (Showtime showtime, double price) {
        this.ticketID = ++ticketCounter;
        this.showtime = showtime;
        this.price = price;
        this.seat_Number = showtime.getHall().getTotalSeats() - showtime.getAvailableSeats();
    }

    @Override
    public String toString() {
        return "--- Ticket ID: " + ticketID + " ---\n" +
               "Showtime: " + showtime.getShowtimeID() + "\n" +
               "Movie: " + showtime.getMovie().getTitle() + "\n" +
               "Hall: " + showtime.getHall().getHallID() + "\n" +
               "Date: " + showtime.getDate() + "\n" +
               "Start Time: " + showtime.getStartTime() + "\n" +
               "End Time: " + showtime.getEndTime() + "\n" +
               "Price: $" + price + "\n" +
               "Seat Number: " + seat_Number + "\n" +
               "--------------------" + "\n";
    }

    public int getTicketID() {
        return ticketID;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public double getPrice() {
        return price;
    }

    public int getSeatNumber() {
        return seat_Number;
    }

    public static int getTicketCounter() {
        return ticketCounter;
    }

}
