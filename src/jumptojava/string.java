package jumptojava;

import javax.print.DocFlavor.STRING;

public class string {
    public static void main(String[] args) {
        //String.format() == 문자열 리턴, printf = 문자열을 출력 
       //System.out.println(String.format("i ate %d apples", 3)); 
     // System.out.printf("i ate %d apples", 3); 
/*
      StringBuffer sb = new StringBuffer();
      sb.append("hello");
      sb.append(" ");
      sb.append("jump to java"); // stingbuffer에서 append 메서드를 쓰면 문자열을 추가해나갈수 있으며 
      String result = sb.toString(); // tostring을 쓰면 StringBuffer를 String 자료형으로 바꿀수있다. 
      System.out.println(result);
        // 그러나 StringBuffer객체는 string보다 메모리 사용량도 많고 무겁다. 따라서 문자열을 추가하거나 변경하는 
        // 작업이 많으면 string 객체를 쓰는것이 도움이 된다. 

      StringBuffer ab = new StringBuffer();
      ab.append("jump to java");
      ab.insert(0, "hello "); // insert는 원하는 위치에 문자열을 삽입함 
       System.out.println(ab.toString()); 
   

    StringBuffer zx = new StringBuffer();
    zx.append("hello jump to java");
    System.out.println(zx.substring(0, 4)); // substring = 객체의 시작 위치에서 끝 위치까지의 문자를 뽑아냄 
 */
/*
    String[] weeks = new String[7];
    weeks[0] = "월";
    weeks[1] = "화";
    weeks[2] = "수";
    weeks[3] = "목";
    weeks[4] = "금";
    weeks[5] = "토";
    weeks[6] = "일";
    System.out.println(weeks);
   */
  //String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
  //System.out.println(weeks[3]);

  String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
  for(int i = 0; i<weeks.length;i++){
    System.out.println(weeks[i]);
  }
  
  
  }
}
