package LV4;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {

    private List<Seat> seat_list;
    private List<String> want_booking_list;

    public BookingManager(List<Seat> seat_list,List<String> want_booking_list) {
        this.seat_list = seat_list;
        this.want_booking_list = want_booking_list;
    }

    public void bookSeat() {



        for (String want_booking : want_booking_list) {
            boolean book = false;
            for (Seat seat : seat_list) {
                if (seat.getSeatNumber().equals(want_booking)) {
                    seat.setStatus();
                    System.out.println("Seat " + want_booking + " has been successfully booked.");
                    book = true;
                    break;
                }
            }
            if (!book) {
                System.out.println("Seat " + want_booking + " does not exist.");
            }
        }


    }

    public void countBookedSeats() {
        int seats_Count = 0;
        for (Seat seat : seat_list) {
            if (seat.getStatus().equals("BOOKED")) {
                seats_Count++;
            }
        }
        System.out.println("Total booked seats: " + seats_Count);
    }
}

