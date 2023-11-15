package values;

public class exchange {
    public static void main(String[] args) {
        // 형 변환 
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n); // 123 출력 (정수)

        int s = 123;
        String nums = "" + n;
        System.out.println(num); // 문자열 123 출력 

        String num1 = String.valueOf(n);
        String num2 = Integer.toString(n); // 두개 모두 정수를 문자열로 바꾸어 리턴한다. 
        System.out.println(num1);
        System.out.println(num2);
        
        // 소수점이 포함되어 있는 숫자 형태의 문자열 
        String numx = "123.456";
        double d = Double.parseDouble(numx); // 문자열 numx를 double형태로 형 변환 
        System.out.println(d);

        // 정수와 실수 사이의 형 변환 
        int n1 = 123;
        double d1 = n1; // 정수를 실수로 
        System.out.println(d1); 

        double d2 = 123.456;
        int n2 = (int)d2; // 실수를 정수로 바꿀땐 캐스팅이 필요 
        System.out.println(n2);

        String numz = "123.456";
        double z = Double.parseDouble(numz); // 문자열을 숫자형으로 바꾸려면 실수로 먼저 바꿔야함 
        int zx = (int)z;
        System.out.println(zx);

        final int k = 123; // final로 설정하면 값을 바꿀 수 없음 
       //   k = 456; 오류 발생 
       
       
    }
}
