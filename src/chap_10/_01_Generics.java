package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스 : 각기 다른 타입의 데이터를 하나의 메소드로 처리할 수 있음
        Integer[] iArray = {1, 2, 3, 4, 5};
//        int[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
//        double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E" };

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("---------------------");

        printAnyArray(iArray);      // int, double 등은 기본 자료형이므로 Generic 메소드에서 바로 사용 불가
        printAnyArray(dArray);      // Wrapper 클래스를 이용해야 함
        printAnyArray(sArray);      // 참조 자료형인 String은 바로 가능
    }

    // T : Type, K : Key, V : Value, E : Element
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
//    private static void printIntArray(int[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " ");      // 1 2 3 4 5
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
//    private static void printDoubleArray(double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
