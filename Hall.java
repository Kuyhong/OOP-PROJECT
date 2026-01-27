public class Hall {
    int hallNumber;
    Seat[] seats;

        public Hall(int hallNumber, int rows, int cols) {
            this.hallNumber = hallNumber;
            seats = new Seat[rows * cols];
            initializeSeats();
        }
// Create seats A, B, C...
            private void initializeSeats() {
                for (int i = 0; i < seats.length; i++) {
                seats[i] = new Seat((char) ('A' + i));
                }
            } 
}

