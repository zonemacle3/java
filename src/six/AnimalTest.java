package six;

public class AnimalTest {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Eagle eagle = new Eagle();

        lion.roar();
        lion.eat();
        lion.sleep();

        eagle.eat();
        eagle.sleep();
        eagle.fly();
    }
}
