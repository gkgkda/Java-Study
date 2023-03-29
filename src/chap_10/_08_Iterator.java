package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터 : 프레임워크 데이터를 순회하는 것
        List<String> list = new ArrayList<>();      // List는 인터페이스, ArrayList는 List를 구현하는 클래스(다형성)
        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------------------");

        Iterator<String> it = list.iterator();    // 반환형을 갖는 메소드의 경우 ctrl+alt+v로 자동 완성
        System.out.println(it.next());            // 순차적으로 커서 이동
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("----------------------");
        it = list.iterator();       // 커서가 4번째에서 중단됐기 때문에 해당 위치에서 재호출(처음 위치로 이동)
        while (it.hasNext()) {      // 다음 커서에 데이터가 있는지 확인
            System.out.println(it.next());
        }
        System.out.println("----------------------");

        it = list.iterator();       // 커서를 처음 위치로 이동
        while (it.hasNext()) {
            String s = it.next();   // 다음 커서로 이동하고 해당 위치의 데이터를 String으로 반환
            if (s.contains("(알 수 없음)")) {
                it.remove();        // (알 수 없음) 데이터가 있으면 삭제
            }
        }
        it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("----------------------");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("----------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        // map.iterator();      // map에는 제공되지 않음
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }
        System.out.println("----------------------");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }
        System.out.println("----------------------");       // [!] map은 key와 value로 나눠져서 번거롭고 순서 보장이 안 됨

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();     // Key와 Value를 세트로 호출
        while(itMap.hasNext()) {
            System.out.println(itMap.next());
        }
    }
}
