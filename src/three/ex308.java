package three;

import java.util.Scanner;

public class ex308 {
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);

    int num1 = (int)(Math.random() * 100+1);
    System.out.println(num1);

    while (true) {
        System.out.print("추측한 숫자를 입력하세요: ");
        int num2 = in.nextInt();
        if (num1 == num2) {
            System.out.println("맞습니다. 숫자는" + num2 +"입니다.");
            break; 
        } else if (num2 > num1) {
            System.out.println("down!");
        } else {
            System.out.println("up!");
        }
    }

    }
}
