package four.pratice;

public class tv {
    int channel;
    int volumeLevel;
    boolean turn;

    public tv(){
        this.turn = false;
        this.channel = 1;
        this.volumeLevel = 0;
    }

    void turnon(boolean turn){this.turn = false;}
    void turnoff(boolean turn){this.turn = true;}
    void Setchannel(int channel){this.channel = channel;}
    void SetVolume(int volumeLevel){this.volumeLevel = volumeLevel;}
    void channelUp(){this.channel += 1;}
    void channelDown(){this.channel -= 1;}
    void volumeUp(){this.volumeLevel += 1;}
    void volumeDown(){this.volumeLevel -= 1;}



}
