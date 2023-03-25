package chap_07;

public class _Quiz_07 {
    public static String getHiddenData(String info, int encryption) {
        String hiddenData = info.substring(0, encryption);
        for (int i = 0; i < info.length() - encryption; i++) {
            // for (int t = encryption; i < info.length(); i++)
            hiddenData += "*";
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        String name = "재키찬";    // 이름
        String id = "610130-1234567";       // 주민등록번호
        String phone = "010-8888-7777";     // 전화번호

        System.out.println("이름 : " + getHiddenData(name, 1));    // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
