package 알쏭달쏭자바200제.Day13;

import java.util.Scanner;

public class 문제122 { //7-14
    static void printBits(int x){
        for(int i = 31; i >= 0 ; i--)
            System.out.print(((x >>> i & 1) == 1) ? '1' :'0');
    }

    static int setN(int x, int pos, int n){ //x의 pos 위치에 있는 비트부터 n개 비트를 1로 변경한 값을 반환
        return x | (~(~0 << n) << pos);
    }

    static int resetN(int x, int pos, int n){ //x의 pos 위치에 있는 비트부터 n개 비트를 0으로 변경한 값을 반환
        return x & ~(~(~0 << n) << pos);
    }

    static int inverseN(int x, int pos,  int n){ //x의 pos 위치에 있는 비트부터 n개 비트를 반전시킨 값을 반환
        return x ^ (~(~0 << n) << pos);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 x의 pos번째 비트부터 n개 비트를 변경합니다.");
        System.out.print("x:"); int x = stdIn.nextInt();
        System.out.print("pos:"); int pos = stdIn.nextInt();
        System.out.print("n:"); int n = stdIn.nextInt();

        System.out.print("x = "); printBits(x);
        System.out.print("\nsetN(x,pos,n) "); printBits(setN(x, pos, n));
        System.out.print("\nresetN(x,pos,n) "); printBits(resetN(x, pos, n));
        System.out.print("\ninverseN(x,pos,n) "); printBits(inverseN(x, pos, n));

    }
}