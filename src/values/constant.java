package values;

/**
 * constant
 */
public class constant {

    enum CoffeeType{ // enum으로 상수값을 묶을 수 있음  
        Americano,
        Ice_Americano,
        Cafe_Latte
    };
    public static void main(String[] args) {
        /*System.out.println(CoffeeType.Americano);
        System.out.println(CoffeeType.Cafe_Latte);
        System.out.println(CoffeeType.Ice_Americano);
    */

    // 반복문에서도 활용 가능 
        for(CoffeeType type:CoffeeType.values()){
            System.out.println(type);
    }
}
}