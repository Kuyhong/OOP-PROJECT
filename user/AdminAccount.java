package user;

import system.Cinema;

public class AdminAccount extends StaffAccount {

    public AdminAccount(String name, String email, String password, String phoneNumber) {
        super(name, email, password, phoneNumber, 0.0f, "Admin");
    }

    public AdminAccount(Account a1) {
        super(a1, 0.0f, "Admin");
    }

    @Override
    public boolean can(String action) {
        if (action.equals(Cinema.VIEW_MOVIES) || 
            action.equals(Cinema.ADD_MOVIE) || 
            action.equals(Cinema.REMOVE_MOVIE) ||
            action.equals(Cinema.VIEW_SHOWTIMES) ||
            action.equals(Cinema.ADD_SHOWTIME) ||
            action.equals(Cinema.REMOVE_SHOWTIME) ) {
            return true;
            }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRole: Admin\nSalary: $" + getSalary();
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj) && obj instanceof AdminAccount) {
            return true;
        }
        return false;
    }
}
