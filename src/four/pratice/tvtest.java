package four.pratice;

public class tvtest {
    public static void main(String[] args) {
         tv t1 = new tv();
         tv t2 = new tv();

         // tv1
         t1.Setchannel(32);
         t1.SetVolume(3);
         t1.turnon(false);


         // tv2
         t2.Setchannel(3);
         t2.SetVolume(2);
         t2.turnon(false);



         System.out.println("tv1's channel is "+t1.channel + " and volume level is "+t1.volumeLevel+" and tv is "+t1.turn);
         System.out.println("tv2's channel is "+t2.channel + " and volume level is "+t2.volumeLevel+" and tv is "+t2.turn);

        t1.volumeDown();
        System.out.println("t1 volume down = "+t1.volumeLevel);

    }
}