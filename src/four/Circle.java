package four;

public class Circle {
    
    double radius;
    static double pi = 3.14;

    Circle(){radius=1;}
    Circle(double radius){this.radius = radius;} // 매개변수로 radius값을 받아 초기화
    //getArea: 원의 넓이를 계산하여 리턴 
    double getArea(){return (pi*radius*radius);} // get = 결과를 반환해줌 
    double getCir(){return (radius*2*pi);}
    void setRadius(double radius){this.radius = radius;} // set = 결과를 받아서 값을 바꿔주는거 
}