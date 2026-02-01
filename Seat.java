public class Seat {
    char row;
    int col;
    boolean isBooked;

    public Seat(char row, int col, boolean isBooked) {
        this.row = row;
        this.col = col;
        this.isBooked = isBooked;
    }

    public void book_Seat(){
        this.isBooked = true;
    }

    public void unbook_Seat(){
        this.isBooked = false;
    }
}       
