package six;

public class Rectangle extends Shape{

    public Rectangle(int x, int y, int width, int height){
        
        super(x,y);
        this.width = width;
        this.height = height;

    }

    private int width; // 가로길이
    private int height; // 세로길이 

    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }    

    public void draw(){
        System.out.printf("(%d,%d)위치에 가로 : %d 세로 : %d\n",super.getX(),super.getY(),this.width,this.height);
    }

    public double area(){
        return(double)(this.width * this.height);
    }
}
