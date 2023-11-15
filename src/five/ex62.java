package five;

import java.util.Scanner;

public class ex62 {
    public static void main(String[] args) {
        double [] values = new double[5]; // 배열크기 

        System.out.println("enter 5 values (ctrl+z to end): ");
        Scanner sc = new Scanner(System.in);
        
        for(int j=0;j<values.length;j++){
            values[j] = sc.nextDouble();
        }
        System.out.println("entered values are : ");
        for(int j=0;j<values.length;j++){
            System.out.println(values[j]);
        }
    }
}