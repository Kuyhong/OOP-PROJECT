public class Seat {
    int seatID;
    boolean isBooked;

    public Seat(int seatID, boolean isBooked) {
        this.seatID = seatID;
        this.isBooked = isBooked;
    }

    public void book_Seat(Seat[] seats, int index){
        seats[index].isBooked = true;
    }

    public void unbook_Seat(Seat[] seats, int index){
        seats[index].isBooked = false;
    }
}       
