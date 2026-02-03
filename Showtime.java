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

    public void view_Showtimes(Showtime[] showtimes) {
        for (int i = 0; i < 3; i++){
            System.out.println("\n--- Showtime ID: " + showtimes[i].showtimeID + " ---");
            System.out.println("Movie title: " + showtimes[i].movie.title);
            System.out.println("Genre: " + showtimes[i].movie.genre);
            System.out.println("Date: " + showtimes[i].date);
            System.out.println("Time: " + showtimes[i].start_Time + " - " + showtimes[i].end_Time);
            System.out.println("Hall: " + showtimes[i].hall.hallID);
            System.out.println("--------------------");
        }
    }
}
