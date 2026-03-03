package user;

import system.Cinema;

public class StaffAccount extends Account {
    private static int staffCounter = 0;

    public StaffAccount(String name, String email, String password, String phoneNumber) {
        super(name, email, password, phoneNumber, "S" + (++staffCounter));
    }
    
    @Override
    public boolean can(String action, Cinema cinema) {
        if (action.equals(Cinema.VIEW_MOVIES) || 
            action.equals(Cinema.BOOK_TICKET) || 
            action.equals(Cinema.VIEW_SHOWTIMES) || 
            action.equals(Cinema.CANCEL_BOOKING)) {
            return true;
        }
        return false;
    }
}
