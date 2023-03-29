package chap_09.detector;

public interface Detectable {
    /*
    1. interface 내에서 생성된 모든 메소드의 기본 형태는 하기와 같다.
    (public abstract) void detect();

    2. 생성된 변수 역시 하기와 같다.
    (public static final) String name = "감지자";
    */

    void detect();      // 감지
}
