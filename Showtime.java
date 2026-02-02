public class Showtime {
    int showtimeID;
    Movie movie;
    String date;
    String from;
    String to;
    Hall hall;

    public Showtime(int showtimeID, String date, Movie movie, Hall hall, String from, String to) {
        this.showtimeID = showtimeID;
        this.movie = movie;
        this.date = date;
        this.hall = hall;
        this.from = from;
        this.to = to;
    }

    public void view_Showtimes() {

    }
}
