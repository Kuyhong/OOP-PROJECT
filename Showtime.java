public class Showtime {
    int showtimeID;
    Movie movie;
    String date;
    int hallNumber;

    public Showtime(int id, String date, Movie movie, int hall) {
        this.showtimeID = id;
        this.movie = movie;
        this.date = date;
        this.hallNumber = hall;
    }
}
