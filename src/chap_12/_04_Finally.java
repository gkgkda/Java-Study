package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        try {
            System.out.println("택시의 문을 연다.");
//            throw new Exception("휴무 택시");
//            System.out.println("택시에 탑승한다.");
        } catch (Exception e) {
            System.out.println("!! 문제 발생 : " + e.getMessage());
        } finally {     // 오류 여부에 상관 없이 반드시 실행, 파일 열기 or DB 커넥션을 열었으면 반드시 finally로 닫아줘야 함
            System.out.println("택시의 문을 닫는다.");
        }

        // try + catch(s)
        // try + catch(s) + finally
        // try + finally

        System.out.println("----------------------");
        try {
            System.out.println(3 / 0);
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
