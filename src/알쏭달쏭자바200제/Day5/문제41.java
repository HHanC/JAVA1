package 알쏭달쏭자바200제.Day5;

import java.util.Scanner;

public class 문제41 { //3-16
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 a"); int a = stdIn.nextInt();
        System.out.print("정수 b"); int b = stdIn.nextInt();
        System.out.print("정수 c"); int c = stdIn.nextInt();

        int med;
        if(a >= b)
            if (b >= c)
                med = b;
            else if ( a <= c)
                med = a;
            else
                med = c;
        else if ( a > c)
            med = a;
        else if (b > c)
            med = c;
        else
            med = b;

        System.out.print("중앙값은"+med+"입니다.");

    }
}
//        if ((b >= a && c <= a) || (b <= a && c >= a))
//            med = a;
//        else if ((a > b && c < b) || (a < b && c > b))
//            med = b;
//        else
//            med = c;
