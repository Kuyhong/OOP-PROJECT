import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Hall[] halls =  {
            new Hall("2D", "Dolby Atmos"),
            new Hall("3D", "Dolby Atmos"),
            new Hall("IMAX", "Dolby Atmos"),
            new Hall("4DX", "Dolby Atmos"),
            new Hall("3D", "Dolby Atmos"),
        };

        Movie[] movies = {
            new Movie("Inception", "Sci-Fi", 148, 8.8, "Christopher Nolan"),
            new Movie("The Godfather", "Crime", 175, 9.2, "Francis Ford Coppola"),
            new Movie("The Dark Knight", "Action", 152, 9.0, "Christopher Nolan"),
            new Movie("Pulp Fiction", "Crime", 154, 8.9, "Quentin Tarantino"),
            new Movie("Forrest Gump", "Drama", 142, 8.8, "Robert Zemeckis"),
            new Movie("The Matrix", "Sci-Fi", 136, 8.7, "The Wachowskis"),
            new Movie("Interstellar", "Sci-Fi", 169, 8.6, "Christopher Nolan"),
            new Movie("Gladiator", "Action", 155, 8.5, "Ridley Scott"),
            new Movie("The Shawshank Redemption", "Drama", 142, 9.3, "Frank Darabont"),
            new Movie("The Avengers", "Action", 143, 8.0, "Joss Whedon"),
        };

        Showtime[] showtimes = {
            new Showtime("1/1/2026", movies[0], halls[0], "8:00 AM", "10:30 AM"),
            new Showtime("1/1/2026", movies[1], halls[0], "11:00 AM", "2:00 PM"),
            new Showtime("1/1/2026", movies[2], halls[0], "2:30 PM", "5:00 PM"),
            new Showtime("1/1/2026", movies[3], halls[1], "8:00 AM", "10:30 AM"),
            new Showtime("1/1/2026", movies[4], halls[1], "11:00 AM", "1:30 PM"),
            new Showtime("1/1/2026", movies[5], halls[1], "2:00 PM", "4:30 PM"),
            new Showtime("1/1/2026", movies[6], halls[2], "8:00 AM", "11:00 AM"),
            new Showtime("1/1/2026", movies[7], halls[2], "11:30 AM", "2:30 PM"),
            new Showtime("1/1/2026", movies[8], halls[2], "3:00 PM", "6:00 PM"),
            new Showtime("1/1/2026", movies[9], halls[2], "6:30 PM", "9:30 PM"),
        };

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
                    System.out.println(movies[i].toString());
                }

            } else if (menu_Choice == 2){

                for (int i = 0; i < showtimes.length; i++){
                    System.out.println(showtimes[i].toString());
                }

            } else if (menu_Choice == 3){

                System.out.print("Enter Showtime ID: ");
                int showtime_ID = input.nextInt();
                for (int i = 0; i < showtimes.length; i++){
                    if (showtimes[i].getShowtimeID() == showtime_ID){
                        System.out.println("Available seats: " + showtimes[i].getAvailableSeats());
                        break;
                    }
                }

            } else if (menu_Choice == 4){

                System.out.println ("Enter Showtime ID: ");
                int showtime_ID = input.nextInt();
                for (int i = 0; i < showtimes.length; i++){
                    if (showtimes[i].getShowtimeID() == showtime_ID){
                        showtimes[i].book_Seat();
                        break;
                    }
                }

            } else if (menu_Choice == 5){

                System.out.println ("Enter Showtime ID: ");
                int showtime_ID = input.nextInt();
                for (int i = 0; i < showtimes.length; i++){
                    if (showtimes[i].getShowtimeID() == showtime_ID){
                        showtimes[i].cancel_Booked_Seat();
                        break;
                    }
                }

            }
        }
    }
}
