package chap_07;

public class _07_VariableScope {
    public static void methodA() {
//        System.out.println(number);
//        System.out.println(result);
    }

    public static void methodB() {
        int result = 1;     // 지역 변수 : 선언된 블록 내에서만 사용 가능
    }

    public static void main(String[] args) {
        int number = 3;

//        System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

//        System.out.println(i);
        {
            int j = 0;
            System.out.println(j);
            System.out.println(number);
        }
//        System.out.println(j);
    }
}