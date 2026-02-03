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

        Showtime[] showtimes = {
            new Showtime(1, "1/1/2026", movies[0], halls[0], "8:00 AM", "10:30 AM"),
            new Showtime(2, "1/1/2026", movies[1], halls[0], "11:00 AM", "2:00 PM"),
            new Showtime(3, "1/1/2026", movies[2], halls[0], "2:30 PM", "5:00 PM"),

        };

        int ticket_Count = 0;
        Ticket[] tickets = new Ticket[100];
        int menu_Choice = 0;

        while (menu_Choice != 6){
            System.out.println("Welcome to the cinema!\n");
            System.out.println("Menu:");  
            System.out.println("1. View Movies");   
            System.out.println("2. View showtimes");
            System.out.println("3. Check seat availability");
            System.out.println("4. Book a seat");
            System.out.println("5. Cancel a booking");
            System.out.println("6. Exit");

            System.out.print("- Enter your choice: ");
            menu_Choice = input.nextInt();

            if (menu_Choice == 1) {
                for (int i = 0; i < movies.length; i++){
                    movies[i].view_Movies(movies[i]);
                }
            } else if (menu_Choice == 2){
                for (int i = 0; i < showtimes.length; i++){
                    showtimes[i].view_Showtimes(showtimes);
                }
            } else if (menu_Choice == 3){
                System.out.print("Enter Showtime ID: ");
                int showtime_ID = input.nextInt();

            } else if (menu_Choice == 4){

            }
        }
    }
}
