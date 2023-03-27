package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction) : 보여줄 건 보여주고 숨길 건 숨기기 위함
        // abstract
        // 추상 클래스 (미완성 형태의 클래스 -> 객체 생성 X, 자식의 상속이 필요함)
        // 추상 메소드 (추상 클래스 or 인터페이에서 사용 가능한, 껍데기만 있는 메소드)

        // Camera camera = new Camera();    // 객체 생성 불가
        FactoryCam factoryCam = new FactoryCam();
//        Camera factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
//        Camera speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
