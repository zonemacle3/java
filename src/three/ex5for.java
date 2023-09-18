package three;

import java.util.Scanner;

public class ex5for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*
        System.out.print("점수를 입력하세요 : ");
        int score = in.nextInt();

        char grade;

        if (score >= 90) {
            grade = 'A';
           // System.out.println('A');
        }
         else if (score >= 80) {
           grade = 'B';
        }
         else if (score >= 70) {
            grade = 'C';
        }
         else if (score >=60) {
            grade = 'D';
        }
         else {
            grade ='F';    
        }
        System.out.println(score + "점은" + grade + "등급임");
    }
     */
    System.out.println("원하는 매뉴를 선택하시오");
    System.out.println("1. additional");
    System.out.println("2. subtraction");
    System.out.println("3. multiplication");
    System.out.println("4. division");
    System.out.println("5. remaning");
    System.out.println();
    System.out.print("Choose number = ");
    int number = in.nextInt();
     if (number == 1) {
           System.out.println("Start : ");
           System.out.print("Enter the first number = ");
           int number1 = in.nextInt();
           System.out.print("Enter the second number = ");
           int number2 = in.nextInt();
        System.out.print("result = ");
        System.out.println(number1 + number2);
        }
         else if (number == 2) {
              System.out.println("Start : ");
           System.out.print("Enter the first number = ");
           int number1 = in.nextInt();
           System.out.print("Enter the second number = ");
           int number2 = in.nextInt();
        System.out.print("result = ");
        System.out.println(number1 - number2);
        }
         else if (number == 3) {
                System.out.println("Start : ");
           System.out.print("Enter the first number = ");
           int number1 = in.nextInt();
           System.out.print("Enter the second number = ");
           int number2 = in.nextInt();
        System.out.print("result = ");
        System.out.println(number1 * number2);
        }
         else if (number == 4) {
                System.out.println("Start : ");
           System.out.print("Enter the first number = ");
           int number1 = in.nextInt();
           System.out.print("Enter the second number = ");
           int number2 = in.nextInt();
        System.out.print("result = ");
        System.out.println(number1 / number2);
        }
        else if (number == 5){
                System.out.println("Start : ");
           System.out.print("Enter the first number = ");
           int number1 = in.nextInt();
           System.out.print("Enter the second number = ");
           int number2 = in.nextInt();
        System.out.println("result = ");
        System.out.println(number1 + number2);
        }
         else {
            System.out.println("wrong number");    
         }
        }
    }