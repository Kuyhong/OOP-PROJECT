public class Showtime {
    int showtimeID;
    Movie movie;
    String date;
    String start_Time;
    String end_Time;
    Hall hall;

    public Showtime(int showtimeID, String date, Movie movie, Hall hall, String start_Time, String end_Time) {
        this.showtimeID = showtimeID;
        this.movie = movie;
        this.date = date;
        this.hall = hall;
        this.start_Time = start_Time;
        this.end_Time = end_Time;
    }

    public void view_Showtimes() {

    }
}
