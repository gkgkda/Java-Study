package chap_08.detector;

import chap_08.reporter.Reportable;

public class AccidentDetector implements Detectable, Reportable {
    @Override
    public void detect() {
        System.out.println("교통 사고를 감지합니다.");
    }

    @Override
    public void report() {
        System.out.println("직전 30초 영상과 함께 신고를 진행합니다.");
    }
}
