package chap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");
        System.out.println("-------------------");

        Coffee c2 = new Coffee();
        c2.order("라떼");
        System.out.println("-------------------");

        // 아주 친한 친구가 방문
        // (익명 클래스, Only specialCoffee 객체에서만 일회성으로 사용할 수 있음)
        Coffee specialCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("(귓속말) 딸기 케이크는 서비스예요.");
            }

            @Override
            public void returnTray() {
                System.out.println("(귓속말) 자리에 두시면 제가 정리할게요.");    // returnTray의 sout 기능 말고 다른 기능을 넣고 싶을 때
            }
        };
        specialCoffee.order("바닐라 라떼");
        specialCoffee.returnTray();
    }
}

class Coffee {
    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }

    public void returnTray() {
        System.out.println("커피 반납이 완료되었습니다.");
    }
}
