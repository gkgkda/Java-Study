package chap_12.clean;

public class CleanRunnable implements Runnable {
    // java는 단일상속이 원칙
    // 지금 같은 경우 CleanThread는 필수적으로 Thread를 상속해야 함(쓰레드를 사용하기 위함)
    // but! 추가로 부모 클래스를 상속해야 할 경우 이 방식으로 해결(Runnable 인터페이스 생성)
    @Override
    public void run() {
        System.out.println("-- 직원 청소 시작 (Runnable) --");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("(직원) " + i + "번방 청소 중 (Runnable)");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 직원 청소 끝 (Runnable) --");
    }
}
