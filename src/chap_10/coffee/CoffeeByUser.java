package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser<T extends User> {     // 타입은 상관 없으나 반드시 User 클래스를 상속하는 T를 사용할 것
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
