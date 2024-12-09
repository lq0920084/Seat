package LV5;

import LV5.Seat;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Seat> seat_list = new ArrayList<>();
        seat_list.add(new Seat("A1"));
        seat_list.add(new Seat("A2"));
        seat_list.add(new Seat("A3"));
        BookingManager booking = new BookingManager(seat_list,List.of("A2", "A3", "A1", "A4"));
        booking.bookSeat();
        booking.countBookedSeats();
    }

}