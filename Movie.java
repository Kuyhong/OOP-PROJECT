public class Movie {
    private static int movieCounter = 0;
    private int movieID;
    private String title;
    private String genre;  
    private int duration;
    private double rating;
    private String director;

    public Movie(String title, String genre, int duration, double rating, String director) {
        this.movieID = ++movieCounter;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
        this.director = director;
    }

    @Override
    public String toString() {
        return "--- Movie ID: " + movieID + " ---\n" +
               "Title: " + title + "\n" +
               "Genre: " + genre + "\n" +
               "Duration: " + duration + " minutes\n" +
               "Rating: " + rating + "/10\n" +
               "Director: " + director + "\n" +
               "--------------------" + "\n";
    }

    public int getMovieID() {
        return movieID;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public double getRating() {
        return rating;
    }

    public String getDirector() {
        return director;
    }
    
    public static int getMovieCounter() {
        return movieCounter;
    }
}

