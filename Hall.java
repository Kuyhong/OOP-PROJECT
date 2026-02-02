public class Hall {
    char hallID;
    Seat[] seats= new Seat[30];

    public Hall(char hallID){
        this.hallID = hallID;
        for (int i = 0; i < seats.length; i++){
            seats[i] = new Seat(i+1, false);
        }
    }

    public void check_Seat_Availability(Seat[] seats){
        char[] available_Seats = new char [30];
        char[] booked_Seats = new char [30];
        for (int i = 0; i < seat.length; i++){
            available_Seats[i] = '-';
            booked_Seats =
        }
        for (int i = 0; i < seats.length; i++){

        }
    }
}

