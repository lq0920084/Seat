package LV5;

public class Seat {
    private String seatNumber;
    private SeatStatus status;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        status = SeatStatus.AVAILABLE;
    }

    public String getSeatNumber() {
        return this.seatNumber;
    }

    public Enum getStatus() {
        return this.status;
    }

    public void setStatus() {
        if (this.status == SeatStatus.AVAILABLE) {
            this.status = SeatStatus.BOOKED;
        } else {
            throw new IllegalStateException("Seat " + seatNumber + " is already");
        }
    }


}
