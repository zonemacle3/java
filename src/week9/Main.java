package week9;

public class Main extends Player{
    public static void main(String[] args) {
        Main main = new Main();
        main.play("shurei");
        main.pause();
        main.stop();
        // play("gangnam style");
    }

    @Override
    void play(String songName) { // void paly 자체도 static으로 선언되야 불러올수있다
        // TODO Auto-generated method stub
       System.out.println(songName+"곡을 재생합니다.");
    }

    @Override
    void pause() {
        // TODO Auto-generated method stub
        System.out.println("곡을 일시정지 합니다.");
    }

    @Override
    void stop() {
        // TODO Auto-generated method stub
        System.out.println("곡을 정지 합니다.");
    }
}
