package chap_09;

import chap_09.camera.SpeedCam;
import chap_09.detector.AccidentDetector;
import chap_09.reporter.VideoReporter;

public class _Quiz_09 {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(new AccidentDetector());
        speedCam.setReporter(new VideoReporter());
        speedCam.detect();
        speedCam.report();
    }
}
