package LV2;


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

    public void setStatus(String status) {
        this.status = status;
    }


}
