package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 하나의 프로세스 (Process) : 여러 개의 쓰레드를 가질 수 있음
        // 쓰레드 (Thread)
        // 기능 실행이 가능한 것 = 프로그램 -> 이를 실행 중인 상태 = 프로세스
        // 프로세스의 자원으로 작업을 수행하는 것 = Thread

        // 1 3 5 7  9
        // 2 4 6 8 10

//        cleanBySelf();
        CleanThread cleanThread = new CleanThread();
//        cleanThread.run();       // 직원 청소  [!] 이렇게 직접 호출하면 동시 작업이 X
        cleanThread.start();      // 새로운 쓰레드 생성하여 main 메소드와 동시에 작업 O

        cleanByBoss();         // 사장님이 청소
    }

    public static void cleanBySelf() {
        System.out.println("-- 혼자 청소 시작 --");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자) " + i + "번방 청소 중");
        }
        System.out.println("-- 혼자 청소 끝 --");
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장님 청소 시작 --");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장님 청소 끝 --");
    }
}
