package chap_08.camera;

public class Camera {   // 부모 클래스(Super Class, 단 하나만 존재)
    public String name;

    public Camera() {
        this("카메라");
//        this.name = "카메라";
    }

    protected Camera(String name) {
        this.name = name;
    }

    public void takePicture() {
        // 사진 촬영
        System.out.println(this.name + " : 사진을 촬영합니다.");
    }

    public void recordVideo() {
        // 동영상 녹화
        System.out.println(this.name + " : 동영상을 녹화합니다.");
    }

    public void showMainPicture() {
        System.out.println(this.name + "의 주요 기능 : 사진 촬영, 동영상 녹화");
    }
}
