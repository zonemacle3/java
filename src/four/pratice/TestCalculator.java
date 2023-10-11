package four.pratice;

import java.util.Scanner;

public class TestCalculator {
  public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
    calculator cal;

    System.out.println("입력 : ");
    int num1 = scn.nextInt();
    String op = scn.next();
    double num2 = scn.nextDouble();

    int result = 0;
    double result1 = 0;

    cal = new calculator(num1);
    
    int plus = cal.getPlus(num2);
    int minus = cal.getMinus(num2);
    int multi = cal.getMulti(num2);
    double div = cal.getDiv(num2);
    double per = cal.getPer(num2);


    
    switch (op) {
        case "+":
        result = cal.getPlus(num2);
        System.out.println("결과 : " + result);
            break;
        case "-":
        result = cal.getMinus(num2);
         System.out.println("결과 : " + result);
         break;
        case "*":
        result = cal.getMulti(num2);
         System.out.println("결과 : " + result);
         break;
        case "/":
        result1 = cal.getDiv(num2);
         System.out.println("결과 : " + result1);
         break;
        case "%":
        result1 = cal.getPer(num2);
         System.out.println("결과 : " + result1);
         break;
        default:
            System.out.println("잘못된 숫자 입력");
            break;
    }
    
  }

}
