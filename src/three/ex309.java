package three;

import java.util.Scanner;

public class ex309 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        

        int attempts = 5;
        int correct = 0;

        
            for(int attempt=1;attempt<=attempts;attempt++){
                 int num1 = (int)(Math.random() * 10+1);
                int num2 = (int)(Math.random() * 10+1);

          if(num1<num2){
        int temp = num1;
            num1 = num2;
            num2 = temp;
        }

                int result = num1 - num2;
                System.out.print(num1 +"-"+ num2 + "? ");
                int put = in.nextInt();
 
                if(put == result){
                    System.out.println("정답입니다.");
                    correct++;
                }
                else{
                    System.out.println("틀렸습니다. " + num1 +"-" +num2 + "는" +result +"입니다.");
                }
            }
        System.out.println("Game Over!");
        System.out.println("총 5문제 중 "+correct +"문제를 맞추었습니다.");
        }
}
