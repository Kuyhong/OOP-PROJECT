package system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cinema cinema = new Cinema("Cineplex", "123 Main St");
        cinema.create_Manager_Account("Kuyhong Chea", "email@example.com", "password123", "0123456789");

    
}
