package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 생성
        // 스트림은 일회용이므로 필요할 때마다 생성해야 함

        // Arrays.stream
        int[] scores = {100, 95, 90, 85, 80};
//        Arrays.stream(scores);        // ctr+alt+v 로 완성
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#" };
        Stream<String> langStream = Arrays.stream(langs);

        // Collection.stream()
        List<String> langList = new ArrayList<>();
//        langList.add("python");
//        langList.add("java");
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
//        System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        // Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");

        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip, ...
        // 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch, ...

        // 90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
//        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("-------------------------- ");

        // 90점 이상인 사람의 수
        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();     // count는 long이므로 형변환 필요
        System.out.println(count);
        System.out.println("-------------------------- ");

        // 90점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("-------------------------- ");

        // 90점 이상인 점수들 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("-------------------------- ");

        // "python", "java", "javascript", "c", "c++", "c#"
        // c로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);   // "c"로 시작되는 문자열 조회
        System.out.println("-------------------------- ");

        // java 라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println("-------------------------- ");

        // 4글자 이하의 언어를 정렬해서 출력
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("-------------------------- ");

        // 4글자 이하면서 c 라는 글자를 포함하는 언어
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .forEach(System.out::println);
        System.out.println("-------------------------- ");

        // 4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어가 하나라도 있는지 여부
        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("c"));   // anyMatch의 return 값은 T/F이므로 boolean으로 받아줘야 함
        System.out.println(anyMatch);
        System.out.println("-------------------------- ");

        // 4글자 이하의 언어들은 모두 c 라는 글자를 포함하는지 여부
        boolean allMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .allMatch(x -> x.contains("c"));
        System.out.println(allMatch);
        System.out.println("-------------------------- ");

        // 4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
        // map : 데이터를 원하는 형태로 가공, ...
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .map(x -> x + " (어려워요)")
                .forEach(System.out::println);
        System.out.println("-------------------------- ");

        // c라는 글자를 포함하는 언어를 대문자로 출력
        langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("-------------------------- ");

        // c라는 글자를 포함하는 언어를 대문자로 변경하고 리스트에 저장
//        langList.stream().filter(x -> x.contains("c")).map(String::toUpperCase).collect(Collectors.toList());
        List<String> langListStartsWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        langListStartsWithC.stream().forEach(System.out::println);
    }


}
