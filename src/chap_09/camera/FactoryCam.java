package chap_09.camera;

import chap_09.detector.Detectable;
import chap_09.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    private Detectable detector;     // 인터페이스 변수 생성
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
