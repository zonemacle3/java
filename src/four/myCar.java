package four;

public class myCar {
    public static void main(String[] args) {
        Car test = new Car();
        
        System.out.println("모델명 = " + test.model + " 색상 = " + test.color + " 제조회사 = " + test.Company);
        System.out.println("최고속도 = " + test.maxSpeed);
        System.out.println("현재속도 = " + test.speed);

        test.speed = 120;
        System.out.println("현재속도 = " + test.speed);
    }
}
