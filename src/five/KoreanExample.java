package five;

public class KoreanExample {  
    public static void main(String[] args) {
        korean k1 = new korean("박찬홍", "02134-45621");
        korean k2 = new korean("승호", "5423-54564");

        System.out.println("k1.name = "+k1.name);
        System.out.println("k1.id = "+k1.id);
        
        System.out.println("k1.name = "+k2.name);
        System.out.println("k1.id = "+k2.id);
    }

}
