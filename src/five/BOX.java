package five;

public class BOX {
    private int width;
    private int length;
    private int height;
    private int volume;

    public int getVolume(){
        return volume; // getvolume 을 통해 volume결과를 불러옴 
    }
    BOX(int w, int l, int h){
        width = w;
        length = l;
        height = h;

        volume = width * length * height;
    }
}
