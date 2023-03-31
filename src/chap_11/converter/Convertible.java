package chap_10.converter;

@FunctionalInterface        // 함수형 인터페이스이므로 메소드를 하나 이상 구현하지 말라는 notation (방지용)
public interface Convertible {
    void convert(int USD);
}
