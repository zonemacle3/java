package five;

public class circle {

    double radius;
    static double pi = 3.14;

    circle(){
        radius = 1;
    }
    circle(double radius){
        this.radius = radius;
    }
    double getArea(){
        return pi*radius*radius;
    }
    double getCircuference(){
        return 2 * pi * radius;
    }
    void setRadius(double radius){
        this.radius = radius; // 포함하고 있는 radius라 this를 사용함 
    }
}
