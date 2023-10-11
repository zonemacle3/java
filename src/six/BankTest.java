package six;

public class BankTest {
    public static void main(String[] args) {
        BadBank b1 = new BadBank();
        NormalBank b2 = new NormalBank();
        BigBank b3 = new BigBank();

        System.out.println("badBank이자율 : "+b1.getRate());
        System.out.println("normalBank이자율 : "+b2.getRate());
        System.out.println("bigBank이자율 : "+b3.getRate());
    }
}
