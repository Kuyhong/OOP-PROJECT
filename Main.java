import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Hall[] halls =  {
            new Hall('A'),
            new Hall('B'),
            new Hall('C'),
        };

        Movie[] movies = {
            new Movie(1, "Inception", "Sci-Fi", 148, 8.8, "Christopher Nolan"),
            new Movie(2, "The Godfather", "Crime", 175, 9.2, "Francis Ford Coppola"),
            new Movie(3, "The Dark Knight", "Action", 152, 9.0, "Christopher Nolan"),
            new Movie(4, "Pulp Fiction", "Crime", 154, 8.9, "Quentin Tarantino"),
            new Movie(5, "Forrest Gump", "Drama", 142, 8.8, "Robert Zemeckis"),
            new Movie(6, "The Matrix", "Sci-Fi", 136, 8.7, "The Wachowskis"),
            new Movie(7, "Interstellar", "Sci-Fi", 169, 8.6, "Christopher Nolan"),
            new Movie(8, "Gladiator", "Action", 155, 8.5, "Ridley Scott"),
            new Movie(9, "The Shawshank Redemption", "Drama", 142, 9.3, "Frank Darabont"),
            new Movie(10, "The Avengers", "Action", 143, 8.0, "Joss Whedon"),
        };

        int ticket_Count = 0;
        Ticket[] tickets = new Ticket[100];

        System.out.println("Welcome to the cinema!\n");
        System.out.println("Menu:");  
        System.out.println("1. View Movies");   
        System.out.println("2. View showtimes");
        System.out.println("3. Check seat availability");
        System.out.println("4. Book a seat");
        System.out.println("5. Cancel a booking");
        System.out.println("6. Exit");

        System.out.print("- Enter your choice: ");
        int choice = input.nextInt();

        if (choice == 1){
            for (int i = 0; i < movies.length; i++){
                movies[i].view_Movies(movies);
            }
        } else if (choice == 2){
            
        }

    }
}
