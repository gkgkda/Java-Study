package chap_09;

//import chap_09.reporter.*;
import chap_09.camera.FactoryCam;
import chap_09.detector.AdvancedFireDetector;
import chap_09.detector.Detectable;
import chap_09.detector.FireDetector;
import chap_09.reporter.NormalReporter;
import chap_09.reporter.Reportable;
import chap_09.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        Reportable normalReporter = new NormalReporter();
//        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
//        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("-----------------------------------");

        FireDetector fireDetector = new FireDetector();
        fireDetector.detect();

        AdvancedFireDetector advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("-----------------------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
