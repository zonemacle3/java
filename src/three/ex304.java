package three;

import java.util.Scanner;

public class ex304 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 입력받기 
        System.out.print("Enter the first number operation(+, -, x, /, %) second number (e.g, 2 + 3) : ");
        int num1 = in.nextInt();
        char operation = in.next().charAt(0);
        int num2 = in.nextInt();
        
        double result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = (double) num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;
                }
                case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;
                }
                break;
            default:
                System.out.println("wrong input");
                return;
        }
        System.out.print("REesult : " + result);
    }
}
