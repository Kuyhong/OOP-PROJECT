package user;

public class ManagerAccount extends StaffAccount {

    public ManagerAccount(String name, String email, String password, String phoneNumber) {
        super(name, email, password, phoneNumber, 0.0f, "Manager");
    }

    public ManagerAccount(Account a1) {
        super(a1, 0.0f, "Manager");
    }

    @Override
    public boolean can(String action) {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRole: Manager\nSalary: $" + getSalary();
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj) && obj instanceof ManagerAccount) {
            return true;
        }
        return false;
    }
}
