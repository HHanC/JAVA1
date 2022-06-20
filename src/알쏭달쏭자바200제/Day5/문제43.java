package 알쏭달쏭자바200제.Day5;

import java.util.Scanner;

public class 문제43 { //3-18
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 a"); int a = stdIn.nextInt();
        System.out.print("정수 b"); int b = stdIn.nextInt();

        if ( a < b ) { //a가 b보다 작으면
            int t = a;
            a = b;
            b = t;
        }
        System.out.print("a>=b가 되도록 정렬했습니다.");
        System.out.print("변수 a는"+a+"입니다.");
        System.out.print("변수 b는"+b+"입니다.");
    }
}
