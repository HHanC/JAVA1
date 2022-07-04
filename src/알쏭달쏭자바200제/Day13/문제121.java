package 알쏭달쏭자바200제.Day13;

import java.util.Scanner;

public class 문제121 { // 7-13
    static void printBits(int x){ //int형 비트 구성
        for(int i = 31; i >= 0; i--)
            System.out.print(((x >>> i & 1)== 1) ? '1' :'0');
    }
    
    static int set(int x, int pos){ //x의 pos 위치에 있는 비트를 1로 변경한 값을 반환
        return x | (1 << pos);
    }

    static int reset(int x, int pos){ //x의 pos 위치에 있는 비트를 0으로 변경한 값을 반환
        return x & ~(1 << pos);
    }

    static int inverse(int x, int pos){ //x의 pos 위치에 있는 비트를 반전시킨 값을 반환
        return x ^ (1 << pos);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 x의 pos 번째 비트를 변경합니다.");
        System.out.print("x:"); int x = stdIn.nextInt();
        System.out.print("pos:"); int pos = stdIn.nextInt();

        System.out.print("x = "); printBits(x);
        System.out.print("\nset(x,pos) "); printBits(set(x, pos));
        System.out.print("\nreset(x,pos) "); printBits(reset(x, pos));
        System.out.print("\ninverse(x,pos) "); printBits(inverse(x, pos));
        System.out.println();
    }
}
