package LV0;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //현재 좌석의 상태가 저장된 어레이리스트 선언.
        List<String> seats = new ArrayList<>();
        //좌석 상태 추가.
        seats.add("A1:AVAILABLE");
        seats.add("A2:AVAILABLE");
        seats.add("A3:AVAILABLE");

        //손님이 원하는 좌석의 리스트 선언.
        List<String> seats2 = List.of("A2", "A3", "A1", "A4");

        //향상된 FOR문으로 손님이 원하는 좌석 번호를 하나씩 받아오기
        for (String seat2 : seats2) {
            //좌석 존재 여부를 확인 할 변수를 boolean으로 선언.
            boolean book = false;

            //for문으로 존재하는 좌석 수 만큼 반복문 적용.
            for (int i = 0; i < seats.size(); i++) {
                //좌석 상태 꺼내오기
                String seat = seats.get(i);
                //만약 좌석 중애 손님이 원하는 좌석이 있다면?
                if (seat.startsWith(seat2)) {
                    //이미 사용중인 좌석인지 확인합니다.
                    if (seat.endsWith("BOOKED")) {
                        //사용중인 좌석이라면 사용중인 좌석이라는 오류를 출력합니다.
                        System.out.println("Seat " + seat2 + " is already booked.");
                        //좌석의 존재여부를 true로 바굽니다.
                        book = true;
                        //이미 좌석을 확인했으니, 반복문을 끝내고 다음 손님이 원하는 좌석 번호를 받아옵니다.
                        break;
                    } else {
                        //좌석이 비어있으니 손님을 앉힙니다.
                        seats.set(i, seat2 + ":BOOKED");
                        //손님을 앉히는데 성공했다는 것을 알립니다.
                        System.out.println("Seat " + seat2 + " has been successfully booked.");
                        //좌석의 존재여부를 true로 바꿉니다.
                        book = true;
                        //이미 좌석을 확인했으니, 반복문을 끝내고 다음 손님이 원하는 좌석 번호를 받아옵니다.
                        break;
                    }
                }
            }

            //만일 모든 좌석을 확인했음에도 손님이 원하는 좌석이 없다면?
            if (!book) {
                //손님이 원하는 좌석이 존재하지 않는 다는 것을 알려줍니다.
                System.out.println("Seat " + seat2 + " does not exist.");
            }
        }

        //앉아있는 좌석수를 샐 변수를 선언하고 0으로 초기화 합니다.
        int count = 0;
        //전체 좌석목록을 하나씩 향삭된 반복무능로 꺼내옵니다.
        for (String seat : seats) {
            //만일 좌성상태가 앉아있는 상태라면?
            if (seat.endsWith("BOOKED")) {
                //앉아있는 좌석수에 1을 더합니다.
                count++;
            }
        }
        //모든 좌석중에 손님이 앉아있는 좌석수를 출력합니다.
        System.out.println("Total booked seats: " + count);
    }
}