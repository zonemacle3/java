package five;

class A{
    public int c; // 공용
    private int a; // 전용
    int b; // 디폴트
}

public class claa {
    public static void main(String[] args) {
        A obj = new A();

        obj.b = 20;
        obj.c = 30;


        System.out.println(obj.b);
        System.out.println(obj.c);

    }
}
