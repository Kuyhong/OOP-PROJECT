package user;

import system.Cinema;

public class CustomerAccount extends Account {

    private float balance;
    
    public CustomerAccount(String name, String email, String password, String phoneNumber) {
        super(name, email, password, phoneNumber);
    }

    public CustomerAccount(Account a1) {
        super(a1.getName(), a1.getEmail(), a1.getPassword(), a1.getPhoneNumber());
    }

    @Override
    public boolean can(String action) {
        if (action.equals(Cinema.VIEW_MOVIES) || 
            action.equals(Cinema.BOOK_TICKET) || 
            action.equals(Cinema.VIEW_SHOWTIMES)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRole: Customer";
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj) && obj instanceof CustomerAccount) {
            return true;
        }
        return false;
    }
    
}
