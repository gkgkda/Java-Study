package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";    // 폴더 생성
        File folder = new File(folderName);
        folder.mkdir();     // 폴더 directory 생성
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다. : " + folder.getAbsolutePath());     // 폴더 절대 경로 출력
        }

        System.out.println("---------------------------------------");

        folderName = "A/B/C";
        // "A" + File.separator + "B" + File.separator + "C"       // OS마다 경로 구분이 다르기 때문에 이 방법으로 하는 게 가장 정확
        // 윈도우 : C:\\Users\\Nadocoding\\Desktop
        // 맥    : /Users/Nadocoding/Desktop
        folder = new File(folderName);
        folder.mkdirs();        // 여러 개의 하위 폴더로 구성된 경우에 사용
//        folder.mkdir();       // 부모 폴더가 존재하는 경우 사용
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다. : " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdirs)");
        }
    }
}
