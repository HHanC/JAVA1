package 알쏭달쏭자바200제.Day5;

import java.util.Scanner;

public class 문제42 { //3-17
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 a"); int a = stdIn.nextInt();
        System.out.print("정수 b"); int b = stdIn.nextInt();

        if(a == b)
            System.out.print("두 값이 같습니다.");
        else {
            int min , max;
            if ( a < b ){
                min = a;
                max = b;
            } else {
                min = b;
                max = a;
            }
            System.out.print("작은 값은"+min+"입니다.");
            System.out.print("큰 값은"+max+"입니다.");
        }
    }
}
