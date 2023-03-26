package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super : 부모 클래스에 접근하여 특정 기능을 수행하게 함. (자식 클래스에서는 원하는 기능을 추가로 구현 가능)
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("--------------------");
        speedCam.takePicture();
    }
}
