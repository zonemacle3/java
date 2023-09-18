package three;

public class ex310 {
    public static void main(String[] args) {
        int count = 0; // 찾은 소수의 개수
        int number = 2; // 시작 숫자

        System.out.println("처음 50개의 소수:");

        while (count < 50) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // 나누어 떨어지는 경우 소수가 아님
            }
        }

        return true; // 위의 조건을 모두 통과하면 소수임
    }
}



