package four;

public class tvTest {
    public static void main(String[] args) {
        tv test = new tv();

        test.channel = 7;
        test.volume = 9;
        test.onOff = true;

        System.out.println("tv채널은 = " +test.channel+" 이고 볼륨은 " + test.volume +" 이고 전원은 "+test.onOff +" 입니다.");


    }
}