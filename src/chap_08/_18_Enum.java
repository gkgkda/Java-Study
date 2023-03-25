package chap_08;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 (Enum)
        // 달력 : JAN, FEB, MAR, ...
        // 옷 사이즈 : S, M, L, XL
        // OS 종류 : WIN10, WIN11, MACOS, LINUX, ...
        // 해상도 : HD, FHD, QHD, UHD, ...

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.print("동영상 녹화 품질 : ");
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        resolution = Resolution.valueOf("UHD");     // valueOf : enum 클래스에서 String 값을 가져옴
        System.out.println(resolution);

        System.out.println("--------------------------");

        for (Resolution myRes : Resolution.values()) {      // values : enum의 요소를 순서대로 배열로 리턴
            System.out.println(myRes.name() + " : " + myRes.ordinal());     // ordinal : enum에 정의된 해당값의 순서를 리턴
        }

        System.out.println("--------------------------");
        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }
    }
}

enum Resolution {   // 서로 연관된 상수의 집합(클래스)
    HD(1280), FHD(1920), UHD(3840);

    private final int width;

    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}