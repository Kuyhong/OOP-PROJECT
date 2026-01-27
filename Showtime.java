public class Showtime {
    int showtimeID;
    String Title;
    String date;
    String time;
    int hallNumber;
    int availableSeats;

    Showtime(int id, String Title, String date, String time, int hall, int seats) {
        this.showtimeID = id;
        this.Title = Title;
        this.date = date;
        this.time = time;
        this.hallNumber = hall;
        this.availableSeats = seats;
    }
}
