package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        String folder = "src/chap_13";
//        String folder = "/Users/3lii/Desktop/JavaWorkSpace/src/chap_13";
//        String folder = ".";     // 현재 위치 경로 (상대)
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + filesAndFolders.getAbsolutePath());
        for (File file : filesAndFolders.listFiles()) {     // 모든 파일과 폴더 정보 읽어옴
            if (file.isFile()) {        // 파일인지 폴더인지 확인
                System.out.println("(파일) " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("(폴더) " + file.getName());
            }
//            System.out.println(file.getName());
        }
    }
}
