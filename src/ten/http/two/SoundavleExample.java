package ten.http.two;

public class SoundavleExample {
    private static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }
    public static void main(String[] args) {
        printSound(new cat());
        printSound(new dog());
    }
}
