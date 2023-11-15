package interfa;

public class cat implements Animal{
    public static char[] sleep;

    public void eat(){System.out.println("고양이가 먹는다");}

    @Override
    public void sleep() {
        // TODO Auto-generated method stub
        System.out.println("고양이가 잔다");
    }
}
