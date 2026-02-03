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

    public void view_Showtimes(Showtime showtime) {
            System.out.println("\n--- Showtime ID: " + showtime.showtimeID + " ---");
            System.out.println("Movie title: " + showtime.movie.title);
            System.out.println("Genre: " + showtime.movie.genre);
            System.out.println("Date: " + showtime.date);
            System.out.println("Time: " + showtime.start_Time + " - " + showtime.end_Time);
            System.out.println("Hall: " + showtime.hall.hallID);
            System.out.println("--------------------");
    }
}
