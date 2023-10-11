package five;

public class ex63Area {
    public static void main(String[] args) {
        ex63[] c = new ex63[5];

        for(int i = 0;i<c.length;i++){
            c[i] = new ex63(i+1.0); // 빈 c배열에 값을 추가 
            System.out.printf("원의 널이(반지름 : %.1f) = %.2f\n",c[i].radius,c[i].findArea());
        }
    }
}
