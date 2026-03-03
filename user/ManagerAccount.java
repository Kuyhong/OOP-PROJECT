package user;

import system.Cinema;

public class ManagerAccount extends Account {
    private static int managerCounter = 0;

    public ManagerAccount(String name, String email, String password, String phoneNumber) {
        super(name, email, password, phoneNumber, "M" + (++managerCounter));
    }

    @Override
    public boolean can(String action, Cinema cinema) {
        return true;
    }

}
