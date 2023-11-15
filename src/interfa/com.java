package interfa;

/**
 * com
 */
public class com extends cat{
    public static void main(String[] args) {
        Animal animal = new cat();
        animal.eat();
        animal.sleep();

        System.out.println(Animal.penny);
    }
    
}
