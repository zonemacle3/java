package five;

import java.util.Scanner;

public class pratice0507 {
    public static void main(String[] args) {
        double [][] values = new double[3][4];

        Scanner sc = new Scanner(System.in);

        double sum = 0;
        
        System.out.println("enter " + values.length + "rows and " + values[0].length + "columns : ");
        for(int i = 0;i<values.length;i++){
            for(int j = 0;j<values[i].length;j++){
                values[i][j] = sc.nextDouble();
                sum += values[i][j];
            }
        }
        System.out.println("Sum of all elements : " + sum);
    }
}
