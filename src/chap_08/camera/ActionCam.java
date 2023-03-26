package chap_08.camera;

public final class ActionCam extends Camera {   // 상속 제한
    public final String lens; // = "광각렌즈";   -> 여기서 초기화 하지 않고 생성자에서 초기화 하는 방법도 O

    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }

    public final void makeVideo() {
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상으로 멋진 비디오를 제작합니다.");
    }
}
