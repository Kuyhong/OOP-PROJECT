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

    public void view_Movies (Movie[] movies){
        for (int i=0; i < 10; i++){
            System.out.println("\n--- Movie ID: " + movies[i].movieID + " ---");
            System.out.println("Movie title: " + movies[i].title);
            System.out.println("Genre: " + movies[i].genre);
            System.out.println("Duration: " + movies[i].duration);
            System.out.println("Rating: " + movies[i].rating);
            System.out.println("Director: " + movies[i].director);
            System.out.println("--------------------");
        }
    }

}

