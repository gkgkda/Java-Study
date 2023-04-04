package chap_12;

public class Room {
    public int number = 1;
    synchronized public void clean(String name) {       // 동기화
        // 직원1 : 3번방 청소 중
        System.out.println(name + " : " + number + "번방 청소 중 ");
        number++;
    }
}
