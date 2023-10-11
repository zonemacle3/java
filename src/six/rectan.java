package six;

public class rectan extends shap{
 
    private int width;
    private int height;

    public rectan(int x, int y, int width, int height){
        super(x, y);

        System.out.println("rectan()");
        this.width=width;
        this.height=height;
    }

    public double calcArea(){
        return(double)(this.width*this.height);
    }
}