package six;

public class Test {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5,3,10,20);
        rec.print();
        rec.draw();

        System.out.println("넓이는 : "+ rec.area());

        rec.setX(80);
        rec.setY(80);
        rec.setWidth(1000);
        rec.setHeight(50);
        rec.print();
        rec.draw();
    }
}

