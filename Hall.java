public class Hall {
    private static int hallCounter = 0;
    private char hallID;
    private String screenType;
    private static int total_Seats = 100;
    private String soundSystem;

    public Hall(String screenType, String soundSystem) {
        this.hallID = (char)('A' + hallCounter++);
        this.screenType = screenType;
        this.soundSystem = soundSystem;
    }

    @Override
    public String toString() {
        return "Hall: " + hallID + "\n" +
               "Screen Type: " + screenType + "\n" +
               "Total Seats: " + total_Seats + "\n" +
               "Sound System: " + soundSystem;
    }

    public char getHallID() {
        return hallID;
    }

    public String getScreenType() {
        return screenType;
    }

    public int getTotalSeats() {
        return total_Seats;
    }

    public String getSoundSystem() {
        return soundSystem;
    }

    public static int getHallCounter() {
        return hallCounter;
    }
}   