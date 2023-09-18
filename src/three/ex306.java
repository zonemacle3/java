package three;

public class ex306 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        
        for(num1 = 1;num1<10;num1++)
        {
            for(num2=1;num2<10;num2++)
            {
                System.out.printf("%3d",num1*num2);
            }
            System.out.println();
        }
    }
}
