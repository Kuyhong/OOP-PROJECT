package user;

import system.Cinema;

public interface IAccount {
    boolean login(Object user);
    void logout();
    boolean register(String name, String email, String password, String phoneNumber);
    
    boolean can (String action, Cinema cinema);
}