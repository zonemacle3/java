public class ex2 {
    public static void main(String[] args) {
        // 상수선언
    final double KM_MILE = 1.609344; // final = 상수선언
    double km; // 변수 선언
    double mile = 60.0; // 변수 초기화

    km = KM_MILE * mile; 
        System.out.println("60마일은 "+km+"킬로미터 입니다");
    }
}
