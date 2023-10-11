package five;

public class TestCircle {
    public static void main(String[] args) {
        circle c1 = new circle();
        System.out.printf("넓이는 %.2f, 둘레는 %.2f\n",c1.getArea(), c1.getCircuference());

        circle c2 = new circle(25);
        System.out.printf("넓이는 %.2f, 둘레는 %.2f\n",c2.getArea(), c2.getCircuference());

        circle c3 = new circle(125);
        System.out.printf("넓이는 %.2f, 둘레는 %.2f\n",c3.getArea(), c3.getCircuference());

        c1.setRadius(100);
        System.out.println("반지름을 100으로 수정후 : ");
        System.out.printf("넓이는 %.2f, 둘레는 %.2f\n",c1.getArea(),c1.getCircuference());
    }
}
