public class Showtime {
    int showtimeID;
    String Title;
    String date;
    String time;
    int hallNumber;
    int availableSeats;

    Showtime(int id, String movie, String date, String time, int hall, int seats) {
        this.showtimeID = id;
        this.Title = movie;
        this.date = date;
        this.time = time;
        this.hallNumber = hall;
        this.availableSeats = seats;
    }
}
