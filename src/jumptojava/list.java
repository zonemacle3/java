package jumptojava;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        // 리스트는 배열과 비슷하지만 가장 큰 차이점은 
        // 배열은 크기가 정해져 있지만 리스트는 변한다는데 있다.
        // 즉 배열의 크기를 10으로 정하면 끝이지만 리스트는 계속 담을수있다. 
        // 자료형의 개수가 계속 변하는 상황은 "리스트"를 사용해야한다.
        
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        pitches.add(0, "133");
        pitches.add(1, "135");
        System.out.println(pitches.get(1)); // .get은 원하는 위치의 값을 출력 
        System.out.println(pitches.size()); // size는 list요소의 개수를 리턴한다. 
        System.out.println(pitches.contains("142")); // contains메서드는 해당 항목이 리스트에 있는지 판별하고 boolean으로 리턴함 

        System.out.println(pitches.remove("129")); // 리스트에서 129를 삭제후 결과를 true or false로 리턴함 
        System.out.println(pitches.remove(0)); // 리스트에서 0번째 자리수를 삭제한후 그 값을 리턴함 


    }
}
