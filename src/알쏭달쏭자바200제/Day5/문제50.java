package 알쏭달쏭자바200제.Day5;

import java.util.Scanner;

public class 문제50 { //4-4
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 a"); int a = stdIn.nextInt();
        System.out.print("정수 b"); int b = stdIn.nextInt();

        if ( a > b ){
            int t = a;
            a = b;
            b = t;
        }

        do {
            System.out.print(a+" ");
            a = a+1;
        } while (a <= b);
        System.out.println();
    }
}
