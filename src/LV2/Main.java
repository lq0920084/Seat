package LV2;


import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Seat> seat_list = new ArrayList<>();
        seat_list.add(new Seat("A1"));
        seat_list.add(new Seat("A2"));
        seat_list.add(new Seat("A3"));

        List<String> want_booking_list = List.of("A2", "A3", "A1", "A4");
        for (String want_booking : want_booking_list) {
            boolean book = false;
            for (Seat seat : seat_list) {
                if (seat.getSeatNumber().equals(want_booking)) {
                    if (seat.getStatus().equals("BOOKED")) {
                        System.out.println("Seat " + want_booking + " is already booked.");
                        book = true;
                        break;
                    } else {
                        seat.setStatus("BOOKED");
                        System.out.println("Seat " + want_booking + " has been successfully booked.");
                        book = true;
                        break;
                    }
                }
            }
            if (!book) {
                System.out.println("Seat " + want_booking + " does not exist.");
            }
        }
        countBookedSeats(seat_list);


    }

    public static void countBookedSeats(List<Seat> seats) {
        int seats_Count = 0;
        for (Seat seat : seats) {
            if (seat.getStatus().equals("BOOKED")) {
                seats_Count++;
            }
        }
        System.out.println("Total booked seats: " + seats_Count);
    }
}