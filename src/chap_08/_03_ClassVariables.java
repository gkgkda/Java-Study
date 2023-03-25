package chap_08;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "[까망이]";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "[하양이]";
        System.out.println(b2.modelName);

        // 특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println(" - 개발 전 - ");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);

        // * 클래스 변수 : 해당 클래스에서 생성된 모든 객체에 공통 기능을 구현할 때 사용
        // canAutoReport는 클래스 변수이므로 하단 방식으로 접근할 것. 'b1.canAutoReport'(X)
        System.out.println("모든 블랙박스 제품의 자동 신고 기능 : " + BlackBox.canAutoReport);

        System.out.println();

        // 기능 개발
        BlackBox.canAutoReport = true;

        System.out.println(" - 개발 후 - ");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품의 자동 신고 기능 : " + BlackBox.canAutoReport);
    }
}