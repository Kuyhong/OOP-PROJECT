package user;

import other.Ticket;
import system.Cinema;

public class UserAccount extends Account {
    private Ticket ticket;
    private static int customerCounter = 0;

    public UserAccount(String name, String email, String password, String phoneNumber) {
        super(name, email, password, phoneNumber, "C" + (++customerCounter));
    }

    @Override
    public boolean can(String action, Cinema cinema) {
        if (action.equals(Cinema.VIEW_MOVIES) || 
            action.equals(Cinema.BOOK_TICKET) || 
            action.equals(Cinema.VIEW_SHOWTIMES)) {
            return true;
        }
        return false;
    }
}
