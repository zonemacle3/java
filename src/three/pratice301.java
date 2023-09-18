package three;

import java.util.Scanner;

public class pratice301 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("점수를 입력하세요: ");
        int score = in.nextInt();

        if(score >= 90)
        {
            System.out.println(score + "점은 " + "A" + "등급입니다");
        }
        if(score >= 80 && score < 90 )
        {
            System.out.println(score + "점은 " + "B" + "등급입니다");
        }
        if(score >= 70 && score < 80) 
        {
            System.out.println(score + "점은 " + "C" + "등급입니다");
        }
        if(score >= 60 && score < 70)
        {
            System.out.println(score + "점은 " + "D" + "등급입니다");
        }
        if(score < 60)
        {
            System.out.println(score + "점은 " + "F" + "등급입니다");
        }
        
        

    }
}
