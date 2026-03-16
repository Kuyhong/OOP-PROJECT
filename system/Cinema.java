package system;

import java.util.ArrayList;
import other.Hall;
import other.Movie;
import other.Showtime;
import other.Ticket;
import user.Account;
import user.AdminAccount;
import user.CashierAccount;
import user.CustomerAccount;
import user.ManagerAccount;

public class Cinema {
    
    public static final String CREATE_CUSTOMER_ACCOUNT = "CREATE_CUSTOMER_ACCOUNT";
    public static final String CREATE_STAFF_ACCOUNT = "CREATE_STAFF_ACCOUNT";
    public static final String VIEW_MOVIES = "VIEW_MOVIES";
    public static final String VIEW_SHOWTIMES = "VIEW_SHOWTIMES";
    public static final String BOOK_TICKET = "BOOK_TICKET";
    public static final String CANCEL_BOOKING = "CANCEL_BOOKING";
    public static final String ADD_MOVIE = "ADD_MOVIE";
    public static final String REMOVE_MOVIE = "REMOVE_MOVIE";
    public static final String UPDATE_MOVIE = "UPDATE_MOVIE";
    public static final String ADD_SHOWTIME = "ADD_SHOWTIME";
    public static final String REMOVE_SHOWTIME = "REMOVE_SHOWTIME";
    public static final String UPDATE_SHOWTIME = "UPDATE_SHOWTIME";
    public static final String UPDATE_ACCOUNT = "UPDATE_ACCOUNT";
    public static final String DELETE_ACCOUNT = "DELETE_ACCOUNT";

    private String name;
    private String address;
    
    private ArrayList<Account> Accounts;
    private ArrayList<Movie> movies;
    private ArrayList<Showtime> showtimes;
    private ArrayList<Ticket> tickets;

    private Account currentUser;

    public Cinema(String name, String address) {
        this.name = name;
        this.address = address;
        this.Accounts = new ArrayList<>();
        this.movies = new ArrayList<>();
        this.showtimes = new ArrayList<>();
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
    public void seed_Data() {
        CashierAccount cashier = new CashierAccount("Cashier", "cashier@example.com", "cashier123", "0123456789");
        AdminAccount admin = new AdminAccount("Admin", "admin@example.com", "admin123", "0123456789");
        ManagerAccount manager = new ManagerAccount("Manager", "manager@example.com", "manager123", "0123456789");

        Accounts.add(manager);
        Accounts.add(admin);
        Accounts.add(cashier);
    }

    public void create_Customer_Account (String name, String email, String password, String phoneNumber) {
        if (currentUser != null && currentUser.can(CREATE_CUSTOMER_ACCOUNT)) {
            Account newAccount = new CustomerAccount(name, email, password, phoneNumber);
            if (newAccount.register(name, email, password, phoneNumber) == true) {
                Accounts.add(newAccount);
            }
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void create_Staff_Account (String name, String email, String password, String phoneNumber, String position) {
        if (currentUser != null && currentUser.can(CREATE_STAFF_ACCOUNT)) {
            Account newAccount = null;
            if (position.equalsIgnoreCase("Cashier")) {
                newAccount = new CashierAccount(name, email, password, phoneNumber);
            } else if (position.equalsIgnoreCase("Admin")) {
                newAccount = new AdminAccount(name, email, password, phoneNumber);
            } else if (position.equalsIgnoreCase("Manager")) {
                newAccount = new ManagerAccount(name, email, password, phoneNumber);
            } else {
                System.out.println("Invalid position. Please choose Cashier, Admin, or Manager.");
                return;
            }
            if (newAccount.register(name, email, password, phoneNumber) == true) {
                Accounts.add(newAccount);
            }
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void view_Movies() {
        if (currentUser != null && currentUser.can(VIEW_MOVIES)) {
            for (Movie movie : movies) {
                movie.toString();
            }
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void view_Showtimes() {
        if (currentUser != null && currentUser.can(VIEW_SHOWTIMES)) {
            for (Showtime showtime : showtimes) {
                showtime.toString();
            }
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void book_Ticket(Showtime showtime, double price) {
        if (currentUser != null && currentUser.can(BOOK_TICKET)) {
            showtime.book_Seat();
            Ticket newTicket = new Ticket(showtime, price);
            tickets.add(newTicket);
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void cancel_Booking(Showtime showtime, Ticket ticket) {
        if (currentUser != null && currentUser.can(CANCEL_BOOKING)) {
            showtime.cancel_Booked_Seat();
            tickets.remove(ticket);
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void add_Movie(String title, String genre, int duration, double rating, String director) {
        if (currentUser != null && currentUser.can(ADD_MOVIE)) {
            Movie newMovie = new Movie(title, genre, duration, rating, director);
            movies.add(newMovie);
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void remove_Movie(String title) {
        if (currentUser != null && currentUser.can(REMOVE_MOVIE)) {
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

    public void update_Movie(String title, String genre, int duration, double rating, String director) {
        if (currentUser != null && currentUser.can(UPDATE_MOVIE)) {
            Movie movieToUpdate = null; 
            for (Movie movie : movies) {
                if (movie.getTitle().equals(title)) {
                    movieToUpdate = movie;
                    break;
                }
            }
            if (movieToUpdate != null) {
                movieToUpdate.setGenre(genre);
                movieToUpdate.setDuration(duration);
                movieToUpdate.setRating(rating);
                movieToUpdate.setDirector(director);
            } else {
                System.out.println("Movie not found.");
            }
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void add_Showtime(String date, Movie movie, Hall hall, String start_Time, String end_Time) {
        if (currentUser != null && currentUser.can(ADD_SHOWTIME)) {
            Showtime newShowtime = new Showtime(date, movie, hall, start_Time, end_Time);
            showtimes.add(newShowtime);
        } else {
            System.out.println("You do not have permission to perform this action.");
        }
    }

    public void remove_Showtime(int showtimeID) {
        if (currentUser != null && currentUser.can(REMOVE_SHOWTIME)) {
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
    
    public void login_Account (Account account) {
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

