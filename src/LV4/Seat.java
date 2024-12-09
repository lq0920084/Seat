package LV4;

public class Seat {
    private String seatNumber;
    private String status;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        status = "AVAILABLE";
    }

    public String getSeatNumber() {
        return this.seatNumber;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus() {
        if (this.status.equals("AVAILABLE")) {
            this.status = "BOOKED";
        } else {
            throw new IllegalStateException("Seat " + seatNumber + " is already");
        }
    }


}
