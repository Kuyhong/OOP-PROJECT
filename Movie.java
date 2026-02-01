public class Movie {
    int movieID;
    String title;
    String genre;  
    int duration;
    double rating;
    String director;

        public Movie(int id, String title, String genre, int duration, double rating, String director) {
            this.movieID = id;
            this.title = title;
            this.genre = genre;
            this.duration = duration;
            this.rating = rating;
            this.director = director;
        }
}

