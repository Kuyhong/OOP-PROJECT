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

    public void view_Movies (Movie movies){
            System.out.println("\n--- Movie ID: " + movies.movieID + " ---");
            System.out.println("Movie title: " + movies.title);
            System.out.println("Genre: " + movies.genre);
            System.out.println("Duration: " + movies.duration);
            System.out.println("Rating: " + movies.rating);
            System.out.println("Director: " + movies.director);
            System.out.println("--------------------");
    }

}

