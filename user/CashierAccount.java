package user;

import system.Cinema;

public class CashierAccount extends StaffAccount {

    public CashierAccount(String name, String email, String password, String phoneNumber) {
        super(name, email, password, phoneNumber, 0.0f, "Cashier");
    }

    public CashierAccount(Account a1) {
        super(a1, 0.0f, "Cashier");
    }
    
    @Override
    public boolean can(String action) {
        if (action.equals(Cinema.VIEW_MOVIES) || 
            action.equals(Cinema.BOOK_TICKET) || 
            action.equals(Cinema.VIEW_SHOWTIMES) || 
            action.equals(Cinema.CANCEL_BOOKING) ||
            action.equals(Cinema.CREATE_CUSTOMER_ACCOUNT)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRole: Cashier\nSalary: $" + getSalary();
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj) && obj instanceof CashierAccount) {
            return true;
        }
        return false;
    }
}
