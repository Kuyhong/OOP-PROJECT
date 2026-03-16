package other;
public class Showtime {
    private static int showtimeCounter = 0;
    private int showtimeID;
    private Movie movie;
    private String date;
    private String start_Time;
    private String end_Time;
    private Hall hall;
    private int available_Seats;

    public Showtime(String date, Movie movie, Hall hall, String start_Time, String end_Time) {
        this.showtimeID = ++showtimeCounter;
        this.movie = movie;
        this.date = date;
        this.hall = hall;
        this.start_Time = start_Time;
        this.end_Time = end_Time;
        this.available_Seats = hall.getTotalSeats();
    }

    @Override
    public String toString() {
        return "Showtime ID: " + showtimeID + "\n" +
               "Date: " + date + "\n" +
               "Movie: " + movie.getTitle() + "\n" +
               "Hall: " + hall.getHallID() + "\n" +
               "Start Time: " + start_Time + "\n" +
               "End Time: " + end_Time;
    }
    
    public int getShowtimeID() {
        return showtimeID;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return start_Time;
    }

    public String getEndTime() {
        return end_Time;
    }

    public Hall getHall() {
        return hall;
    }

    public int getAvailableSeats() {
        return available_Seats;
    }

    public static int getShowtimeCounter() {
        return showtimeCounter;
    }

    public void setDate(String date) {
        this.date = date;
    }   

    public void setStartTime(String start_Time) {
        this.start_Time = start_Time;
    }

    public void setEndTime(String end_Time) {
        this.end_Time = end_Time;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public void setAvailableSeats(int available_Seats) {
        this.available_Seats = available_Seats;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void book_Seat() {
        if (available_Seats > 0) {
            available_Seats--;
            System.out.println("Seat booked successfully! Remaining seats: " + getAvailableSeats());
        } else {
            System.out.println("No seats available for this showtime.");
        }
    }

    public void cancel_Booked_Seat() {
        if (available_Seats < hall.getTotalSeats()) {
            available_Seats++;
            System.out.println("Booked seat cancelled successfully! Remaining seats: " + getAvailableSeats());
        } else {
            System.out.println("No seat is booked for this showtime.");
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
        
        Showtime other = (Showtime) obj;
        return this.showtimeID == other.showtimeID;
    }
}
