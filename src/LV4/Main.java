package LV4;

import LV4.Seat;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        BookingManager booking = new BookingManager(List.of("A2", "A3", "A1", "A4"));
        booking.bookSeat();
        booking.countBookedSeats();
    }

}