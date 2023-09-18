package three;

import java.util.Scanner;

public class ex305 {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        System.out.print("연도를 입력하세요 : ");
        int year = in.nextInt();

        switch (year%12) {
            case 0:
                System.out.println(year + "년은 원숭이의 해입니다.");
                break;
            case 1:
                System.out.println(year + "년은 닭의 해입니다.");
                break;               
            case 2:
                System.out.println(year + "년은 개의 해입니다.");
                break;
            case 3:
                System.out.println(year + "년은 돼지의 해입니다.");
                break;
            case 4:
                System.out.println(year + "년은 쥐의 해입니다.");
                break;
            case 5:
                System.out.println(year + "년은 황소의 해입니다.");
                break;
            case 6:
                System.out.println(year + "년은 사자의 해입니다.");
                break;
            case 7:
                System.out.println(year + "년은 토끼의 해입니다.");
                break;
            case 8:
                System.out.println(year + "년은 용의 해입니다.");
                break;
            case 9:
                System.out.println(year + "년은 뱀의 해입니다.");
                break;    
            case 10:
                System.out.println(year + "년은 말의 해입니다.");
                break;    
            case 11:
                System.out.println(year + "년은 양의 해입니다.");
                break;    
            default:
                System.out.println("잘못 입력했습니다.");
                break;
        }

}    
}
