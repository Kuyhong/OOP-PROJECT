public class Hall {
    private int hallNumber;
    private int totalSeats;
    private int availableSeats;
    private Seat[][] seatLayout;

        public Hall(int hallNumber, int rows, int cols) {
            this.hallNumber = hallNumber;
            this.totalSeats = rows * cols;
            this.availableSeats = this.totalSeats;
            
            seatLayout = new Seat[rows][cols];
                for (int i = 0; i < rows; i++) {
                char rowLetter = (char) ('A' + i); 
                for (int j = 0; j < cols; j++) {
                seatLayout[i][j] = new Seat("" + rowLetter + (j + 1)); 
            }
        }
    }
}
