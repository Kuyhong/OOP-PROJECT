public class Showtime {
    private int showtimeID;
    private String movieTitle;
    private String date;
    private String time;
    private int hallNumber;
    private int availableSeats;
        public Showtime(int id, String movie, String date, String time, int hall, int seats) {
            this.showtimeID = id;
            this.movieTitle = movie;
            this.date = date;
            this.time = time;
            this.hallNumber = hall;
            this.availableSeats = seats;
}
