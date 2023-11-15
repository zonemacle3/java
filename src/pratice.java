import java.util.Scanner;

public class pratice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int base = in.nextInt();
        int height = in.nextInt();
        boolean isTall = height > base;

        if(isTall)
        {
            System.out.println("키가 큽니다.");
        }
        

        /* 
        int i = in.nextInt();
        boolean isodd = i % 2 == 1;
        System.out.println(isodd);
        */
        /*
        String a = "hello";
        String b = "java";
        String c = "hello";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
         */
    }
}
