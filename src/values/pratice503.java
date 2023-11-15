package values;

import java.util.Arrays;
import java.util.Collections;

public class pratice503 {
    public static void main(String[] args) {
        int[] pre = new int[]{1,5,3,4,5,5};
        
        int max = Arrays.stream(pre).max().getAsInt();
        int min= Arrays.stream(pre).min().getAsInt();
        
        System.out.println("최대 : " + max);
        System.out.println("최소 : " + min);

        }
}
