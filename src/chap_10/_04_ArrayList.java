package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // Collection Framework : 많은 데이터를 쉽고 간편하게 관리할 수 있게 하는 일종의 클래스 모음
        // List(Array / Linked), Set, Map
        // ArrayList : 배열 기반의 컬렉션, 데이터를 추가 또는 삭제해 배열의 길이를 자동으로 조절해줌
        // * 중복 데이터 허용

        // String 데이터를 보관할 수 있는 ArrayList 생성
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("호도이");

        // 데이터 조회 (인덱스 기준)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("----------------------------");

        // 삭제 (박명수 씨가 이사)
        System.out.println("신청 학생 수 (이사 전) : " + list.size());     // list에 들어 있는 데이터 수 확인 (5)
        list.remove("박명수");     // ""데이터 삭제
        System.out.println("신청 학생 수 (이사 후) : " + list.size());     // 4
        System.out.println(list.get(3));

        System.out.println("----------------------------");

        System.out.println("남은 학생 수 (제외 전) : " + list.size());      // 4
        list.remove(list.size() - 1);      // 마지막 인덱스의 데이터 삭제
        System.out.println("남은 학생 수 (제외 후) : " + list.size());      // 3


        System.out.println("----------------------------");
        // 순회
        for (String s : list) {
            System.out.println(s);
        }

        // 변경 (수강권 양도)
        System.out.println("수강권 양도 전 : " + list.get(0));        // 해당 인덱스의 데이터 반환
        list.set(0, "재키찬");
        System.out.println("수강권 양도 후 : " + list.get(0));

        System.out.println("----------------------------");

        // 확인
        System.out.println(list.indexOf("김종국"));        // 해당 list에서 "김종국" 데이터 조회

        // 선착순 5명 내에 포함되었는가?
        if (list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패 TT");
        }

        System.out.println("----------------------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }
        System.out.println("----------------------------");

        // 다음 학기에 새로 공부 시작
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("호도이");

        // 정렬
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
