package LV1;

import java.util.HashMap;
import java.util.Map;

import static LV1.Main.countBookedSeats;

public class Main {

    public static void main(String[] args) {
        Map<String, String> seats = new HashMap<>();
        seats.put("A1", "AVAILABLE");
        seats.put("A2", "AVAILABLE");
        seats.put("A3", "AVAILABLE");

        bookSeat(seats, "A2");
        bookSeat(seats, "A3");
        bookSeat(seats, "A1");
        bookSeat(seats, "A4");
        countBookedSeats(seats);


    }

    public static void bookSeat(Map<String, String> seats, String want_booking_seat) {

        if (seats.containsKey(want_booking_seat)) {
            if (seats.get(want_booking_seat).equals("BOOKED")) {
                System.out.println("Seat " + want_booking_seat + " is already booked.");
            } else {
                seats.put(want_booking_seat, "BOOKED");
                System.out.println("Seat " + want_booking_seat + " has been successfully booked.");
            }
        } else {
            System.out.println("Seat " + want_booking_seat + " does not exist.");
        }

    }

    public static void countBookedSeats(Map<String, String> seats) {
        int seats_Count = 0;
        for (String seat : seats.keySet()) {
            if (seats.get(seat).equals("BOOKED")) {
                seats_Count++;
            }
        }
        System.out.println("Total booked seats: " + seats_Count);
    }
}
