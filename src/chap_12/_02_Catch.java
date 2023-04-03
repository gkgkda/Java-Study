package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try {
//             System.out.println(3 / 0);
            int[] arr = new int[3];
            arr[5] = 100;
//
//            Object obj = "test";
//            System.out.println((int) obj);

            String s = null;
            System.out.println(s.toLowerCase());
        } catch (ClassCastException e) {
            System.out.println("잘못된 형 변환입니다.");
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {        // 다른 에러를 한꺼번에 처리 하고 싶은 경우
            System.out.println("ㅋㅋ 뭔가 실수하셨네요.");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("인덱스를 잘못 설정했어요.");
//        } catch (ArithmeticException e) {       // 처리 구문(Parameter와 일치하는 에러가 발생했으니 여기서 종료)
//            System.out.println("뭔가 잘못 계산하셨네요.");
        } catch (Exception e) {     // Exception은 다른 모든 오류들의 조상 클래스라고 볼 수 있음
            System.out.println("그 외의 모든 에러는 여기서 처리 돼요.");
//            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
