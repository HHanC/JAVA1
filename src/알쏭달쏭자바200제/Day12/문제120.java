package 알쏭달쏭자바200제.Day12;

import java.util.Scanner;

public class 문제120 {

    //--- int형 비트 구성 ---//
    static void printBits(int x){
        for(int i = 31; i >= 0; i--){
            System.out.println(((x >>> i & 1) == 1) ? '1' : '0');
        }
    }
    //--- x를 오른쪽으로 n비트 회전한 값 반환 ---//
    static int rRotate(int x, int n){
        if(n < 0) return lRotate(x, -n);
        n %= 32;
        return (n == 0 ? x : (x >>> n) | (x << (32 - n)));
    }

    //--- x를 왼쪽으로 n비트 회전한 값 반환 ---//
    static int lRotate(int x , int n){
        if (n < 0) return rRotate(x, -n);
        n %= 32;
        return (n == 0 ? x : (x << n) | (x >>> (32 - n)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수x를 n비트 회전합니다.");
        System.out.print("x가 : "); int x = scanner.nextInt();
        System.out.print("n가 : "); int n = scanner.nextInt();
        System.out.print("회전 전 =  "); printBits(x);

        System.out.print("\n오른쪽 회전 = "); printBits(rRotate(x , n));
        System.out.print("\n왼쪽 회전 = "); printBits(lRotate(x , n));
        System.out.println();

    }

}
