package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생 (학생 = 사람 = Student is a Person.)
        // class Teacher extends Person : 교사 (교사 = 사람 = Teacher is a Person.)
        // But 모든 사람이 학생 or 교사인 것은 아님.

        Camera camera = new Camera();
//        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
//        FactoryCam factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();
//        SpeedCam speedCam = new SpeedCam();

        camera.showMainPicture();
        factoryCam.showMainPicture();
        speedCam.showMainPicture();

        System.out.println("-----------------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainPicture();
        }

        System.out.println("-----------------------------");

        // factoryCam.detectFire();
        // speedCam.checkSpeed();
        // speedCam.recognizeLicensePlate();

        if (camera instanceof Camera) {
            System.out.println("카메라 입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam) factoryCam).detectFire();      // factoryCam 객체를 FactoryCam 클래스로 형변환
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }

//        Object[] objs = new Object[3];     // 모든 Class는 'Object'라는 클래스를 기본 상속함.
//        objs[0] = new Camera();
//        objs[1] = new FactoryCam();
//        objs[2] = new SpeedCam();
    }
}
