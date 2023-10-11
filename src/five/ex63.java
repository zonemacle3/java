package five;

import four.Circle;

public class ex63 {
    double radius;

    public ex63(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    double findArea(){
        return 3.14 * radius * radius;
    }
}
