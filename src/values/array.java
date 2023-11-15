package values;

import java.util.Arrays;
import java.util.HashSet;

public class array {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H","E","l","l","O"));
        System.out.println(set); // 집합 자료형은 중복을 허용안하며 순서가 없기에 값이 무작위로 나온다. 
        // 이러한 역할로 자료형의 중복을 제거하기 위한 필터 역할로도 사용한다. 

        // 교집합 구하기 
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        HashSet<Integer> intersection = new HashSet<>(s1); // s1으로 intersection을 만듬 
        intersection.retainAll(s2); // 교집합 수행 
        System.out.println(intersection);

        HashSet<Integer> union = new HashSet<>(s1); // s1으로 union을 만듬 
        intersection.addAll(s2); // 합집합 수행 
        System.out.println(union);

        HashSet<Integer> substract = new HashSet<>(s1);  // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행
        System.out.println(substract);  // [1, 2, 3] 출력

        HashSet<String> arr =new HashSet<>();
        arr.add("jump"); // add = 집합 자료형에 값을 추가 
        arr.add("to");
        arr.add("high");
        System.out.println(arr); // 집합 자료형이므로 값이 랜덤으로 나옴 
        arr.addAll(Arrays.asList("wow","lol")); // 한번에 여러개 추가할때는 addAll 활용 
        System.out.println(arr);
        arr.remove("jump"); // 값을 삭제 
        System.out.println(arr);
    }
}