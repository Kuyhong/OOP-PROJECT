public class Hall {
    char hallID;
    Seat[] seats;
    int[] available_Seats;
    int[] booked_Seats;

    public Hall(char hallID){
        this.hallID = hallID;

        seats = new Seat[30];
        available_Seats = new int[30];
        booked_Seats = new int[30];

        for (int i = 0; i < seats.length; i++){
            seats[i] = new Seat(i+1, false);
            available_Seats[i] = 0;
            booked_Seats[i] = 0;
        }
    }

    public void check_Seat_Availability(Seat[] seats){
        int j = 0;
        int k = 0;
        for (int i = 0; i < seats.length; i++){
            if (seats[i].isBooked == false){
                available_Seats[j] = i+1;
                j++;
            } else {
                booked_Seats[k] = i+1;
                k++;
            }
        }
    }

    public void print_Available_Seats (int[] available_Seats){
        System.out.print("Available seats: ");
        for (int i = 0; i < seats.length; i++){
            if (available_Seats[i] != 0){
                System.out.print(available_Seats[i] + " ");
            }
        }
    }

    public void print_Booked_Seats (int[] booked_seats){
        System.out.print("Booked seats: ");
        for (int i = 0; i < seats.length; i++){
            if (booked_Seats[i] != 0){
                System.out.print(booked_Seats[i] + " ");
            }
        }
    }
}

