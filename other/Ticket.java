package other;

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

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public void setSeatNumber(int seat_Number) {
        if (seat_Number > 0) {
            this.seat_Number = seat_Number;
        } else {
            System.out.println("Seat number must be positive.");
        }
    }

    public void setShowtime(Showtime showtime) {
        if (showtime != null) {
            this.showtime = showtime;
        } else {
            System.out.println("Showtime cannot be null.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        Ticket other = (Ticket) obj;
        return this.ticketID == other.ticketID;
    }
}
