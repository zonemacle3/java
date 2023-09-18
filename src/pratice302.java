import java.util.Scanner;

public class pratice302 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

     System.out.println("Enter anyh three integers : ");
     int x = in.nextInt();
     int y = in.nextInt();
     int z = in.nextInt();

     int temp;
     if(x>y){
        temp=y; y = x; x = temp;
     }
     if(y>z){
        temp=z; z = y; y = temp;
     }
     if(x>z){
        temp=x;x = z;z = temp;
     }
     System.out.println("The largest integer is " + z + ", and the smallest integer is " + x);
    }
}