package five;

import java.util.Scanner;

public class eX6 {
    public static void main(String[] args) {
        
        System.out.println("enter a string : ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = s1.toLowerCase();
        int count = 0;
        for(int i = 0;i < s1.length();i++){
          //  if(Character.isUpperCase(s1.charAt(i)))
           // count ++;
           if(s1.charAt(i) != s2.charAt(i)){count++;}
        }
        System.out.println();
        System.out.println("대문자의 수는 "+count+"개 입니다.");
    }
}
