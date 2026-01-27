public class Hall {
    int hallNumber;
    int totalSeats;
    int availableSeats;
    Seat[][] seatLayout;

        public Hall(int hallNumber, int rows, int cols) {
            this.hallNumber = hallNumber;
            this.totalSeats = rows * cols;
            this.availableSeats = this.totalSeats;
            
            seatLayout = new Seat[rows][cols];
    
        }
}

