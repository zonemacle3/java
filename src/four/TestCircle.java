package four;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("둘레는 : "+c1.getCir());
        System.out.println("넓이는 : "+c1.getArea());
        
        Circle c2 = new Circle(25);
        System.out.println("둘레는 : "+c2.getCir());
        System.out.println("넓이는 : "+c2.getArea());
        
        c1.setRadius(100);
        System.out.println("둘레는 : "+c1.getCir());
        System.out.println("넓이는 : "+c1.getArea());
          
    }
}
