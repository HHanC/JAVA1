package 알쏭달쏭자바200제.Day12;

import java.util.Scanner;

public class 문제119 {

    //--- 2의 거듭 제곱 반환 ---//
    static int pow2(int no){
        int pw = 1;
        while(no --> 0){
            pw *=  2;
        }
        return pw;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 x를 n비트 시프트합니다.");
        System.out.print("x : "); int x = scanner.nextInt();
        System.out.print("n : "); int n = scanner.nextInt();

        int mPower = x * pow2(n); // 2의 n승을 곱한 값
        int dPower = x * pow2(n); // 2의 n승으로 나눈 값
        int lShift = n; // n비트 왼쪽으로 시프트한 값
        int rShift = n; // n비트 오른쪽으로 시프트한 값

        System.out.printf("[a] X x (2의 %d승) = %d\n" , n , mPower);
        System.out.printf("[b] X / (2의 %d승) = %d\n" , n , dPower);
        System.out.printf("[c] X << %d = %d\n , n " , lShift);
        System.out.printf("[d] X >> %d = %d\n , n " , rShift);

        System.out.println("[a]와 [c]의 값이 일치" + ((mPower == lShift) ? "합니다." : "하지 않습니다."));
        System.out.println("[b]와 [d]의 값이 일치" + ((dPower == rShift) ? "합니다." : "하지 않습니다."));

    }

}
