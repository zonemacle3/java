package six;

public class Shape {
    private int x;
    private int y;

    public Shape(int x, int y){
        this.x = x;
        this.y = y; // shape에 int x, int y라는 생성자를 만들어서 보냄 
    }

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }

    public void print(){
        System.out.println("x좌표 : "+x+"y 좌표 : "+y);
    }
}
