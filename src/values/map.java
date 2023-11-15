package values;

import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people"));
        System.out.println(map.containsKey("baseball"));
        System.out.println(map.containsValue("사람"));
       // System.out.println(map.remove("people")); // 키를 삭제하며 리턴 
        //System.out.println(map.get("people")); // 키를 삭제했으니 null 값이 나옴 
        //System.out.println(map.size()); // people를 삭제했으니 값이 1이 나옴 
        System.out.println(map.keySet()); // key값을 집합 자료형으로 리턴하고 리스트 자료형으로 바꾸어 사용 가능 
    }

}

