package system;

import java.util.ArrayList;
import other.Hall;
import other.Movie;
import other.Showtime;
import other.Ticket;
import user.IAccount;
import user.ManagerAccount;
import user.StaffAccount;
import user.UserAccount;

public class Cinema {
    
    public static final String CREATE_CUSTOMER_ACCOUNT = "CREATE_CUSTOMER_ACCOUNT";
    public static final String CREATE_STAFF_ACCOUNT = "CREATE_STAFF_ACCOUNT";
    public static final String CREATE_MANAGER_ACCOUNT = "CREATE_MANAGER_ACCOUNT";
    public static final String VIEW_MOVIES = "VIEW_MOVIES";
    public static final String VIEW_SHOWTIMES = "VIEW_SHOWTIMES";
    public static final String BOOK_TICKET = "BOOK_TICKET";
    public static final String CANCEL_BOOKING = "CANCEL_BOOKING";
    public static final String ADD_MOVIE = "ADD_MOVIE";
    public static final String REMOVE_MOVIE = "REMOVE_MOVIE";
    public static final String ADD_SHOWTIME = "ADD_SHOWTIME";
    public static final String REMOVE_SHOWTIME = "REMOVE_SHOWTIME";

    private String name;
    private String address;
    
    private ArrayList<IAccount> Accounts;
    private ArrayList<Movie> movies;
    private ArrayList<Showtime> showtimes;
    private ArrayList<Hall> halls; 
    private ArrayList<Ticket> tickets;

    private IAccount currentUser;

    public Cinema(String name, String address) {
        this.name = name;
        this.address = address;
        this.Accounts = new ArrayList<>();
        this.movies = new ArrayList<>();
        this.showtimes = new ArrayList<>();
        this.halls = new ArrayList<>();
        this.tickets = new ArrayList<>();
        this.currentUser = null;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // Methods
    public void create_Customer_Account (String name, String email, String password, String phoneNumber) {
        if (currentUser != null && currentUser.can(CREATE_CUSTOMER_ACCOUNT, this)) {
            UserAccount newAccount = new UserAccount(name, email, password, phoneNumber);
            if (newAccount.register(name, email, password, phoneNumber) == true) {
                Accounts.add(newAccount);
            }
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void create_Staff_Account (String name, String email, String password, String phoneNumber) {
        if (currentUser != null && currentUser.can(CREATE_STAFF_ACCOUNT, this)) {
            StaffAccount newAccount = new StaffAccount(name, email, password, phoneNumber);
            if (newAccount.register(name, email, password, phoneNumber) == true) {
                Accounts.add(newAccount);
            }
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void create_Manager_Account (String name, String email, String password, String phoneNumber) {
        if (currentUser != null && currentUser.can(CREATE_MANAGER_ACCOUNT, this)) {
            ManagerAccount newAccount = new ManagerAccount(name, email, password, phoneNumber);
            if (newAccount.register(name, email, password, phoneNumber) == true) {
                Accounts.add(newAccount);
            }
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void view_Movies() {
        if (currentUser != null && currentUser.can(VIEW_MOVIES, this)) {
            for (Movie movie : movies) {
                movie.toString();
            }
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void view_Showtimes() {
        if (currentUser != null && currentUser.can(VIEW_SHOWTIMES, this)) {
            for (Showtime showtime : showtimes) {
                showtime.toString();
            }
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void book_Ticket(Showtime showtime, double price) {
        if (currentUser != null && currentUser.can(BOOK_TICKET, this)) {
            showtime.book_Seat();
            Ticket newTicket = new Ticket(showtime, price);
            tickets.add(newTicket);
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void cancel_Booking(Showtime showtime, Ticket ticket) {
        if (currentUser != null && currentUser.can(CANCEL_BOOKING, this)) {
            showtime.cancel_Booked_Seat();
            tickets.remove(ticket);
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void add_Movie(String title, String genre, int duration, double rating, String director) {
        if (currentUser != null && currentUser.can(ADD_MOVIE, this)) {
            Movie newMovie = new Movie(title, genre, duration, rating, director);
            movies.add(newMovie);
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void remove_Movie(String title) {
        if (currentUser != null && currentUser.can(REMOVE_MOVIE, this)) {
            Movie movieToRemove = null; 
            for (Movie movie : movies) {
                if (movie.getTitle().equals(title)) {
                    movieToRemove = movie;
                    break;
                }
            }
            if (movieToRemove != null) {
                movies.remove(movieToRemove);
            } else {
                System.out.println("Movie not found.");
            }
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void add_Showtime(String date, Movie movie, Hall hall, String start_Time, String end_Time) {
        if (currentUser != null && currentUser.can(ADD_SHOWTIME, this)) {
            Showtime newShowtime = new Showtime(date, movie, hall, start_Time, end_Time);
            showtimes.add(newShowtime);
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void remove_Showtime(int showtimeID) {
        if (currentUser != null && currentUser.can(REMOVE_SHOWTIME, this)) {
            Showtime showtimeToRemove = null; 
            for (Showtime showtime : showtimes) {
                if (showtime.getShowtimeID() == showtimeID) {
                    showtimeToRemove = showtime;
                    break;
                }
            }
            if (showtimeToRemove != null) {
                showtimes.remove(showtimeToRemove);
            } else {
                System.out.println("Showtime not found.");
            }
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void login_Account (IAccount account) {
        if (account.login(account) == true) {
            currentUser = account;
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }
    }

    public void logout_Account() {
        if (currentUser != null) {
            currentUser.logout();
            currentUser = null;
        } else {
            System.out.println("No user is currently logged in.");
        }
    }
}
