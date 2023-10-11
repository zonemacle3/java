package six;

public class color extends rectan{
    String color;

    public color(int x, int y, int width, int height, String color){
        super(x, y, width, height);

        System.out.println("color()");
        this.color=color;
    }
}
