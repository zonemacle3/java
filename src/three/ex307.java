package three;

import java.util.Scanner;

public class ex307 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num1 = (int)(Math.random() *10); // double 형태라 0.2 이런식으로 나와서 * 10을 함 
        int num2 = (int)(Math.random() *10);
        int answer;
                /* 
        System.out.println(num1 + "+" + num2 + "?");
        answer = in.nextInt(); 
        if(answer != num1+num2){
            System.out.println("틀렸다.");
        }
        else  {
            System.out.println("정답입니다.");
        }
        */
        while(true) {
            System.out.println(num1 + "+" + num2 + "?");
            answer = in.nextInt();
             if(answer != num1+num2){
            System.out.println("틀렸다.");
        }
        else  {
            System.out.println("정답입니다.");
            break;
         } 
     }
  }
}