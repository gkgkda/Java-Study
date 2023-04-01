package chap_09;

//import chap_08.BlackBoxRefurbish;
//import chap_08.*;     // chap_08에 존재하는 클래스를 전부 사용하겠다.

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";   // public
//        b1.resolution = "FHD";   // default
//        b1.price = 200000;       // private
//        b1.color = "블랙";          // protected
    }
}
