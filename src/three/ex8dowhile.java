package three;

import java.util.Scanner;

public class ex8dowhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = 0;

        for(int i = 0;i<5;i++)
        {
           int num1 = (int)(Math.random()*10);
           int num2 = (int)(Math.random()*10);
             if(num1<num2)
             {
                int tmp = num1;
                num1 = num2;
                num2 = tmp;
             } 
             System.out.println(num1 + "-" + num2 + "?");
             int answer = in.nextInt();

             if(answer == num1-num2)
             {
                System.out.println("정답입니다.");
                score++;
             }
             else{
                System.out.println("틀렸습니다.");
             }
             
        }
                System.out.println("Game Over!!");
                System.out.println("총 5 문제중" + score + "문제 맞췄음");
    }
}
