package 알쏭달쏭자바200제.Day3;

import java.util.Scanner;

public class 실전문제 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("x와 y를 곱하고 나눕니다.");
        System.out.print("x의 값: "); //x값의 입력 메시지
        int x = stdIn.nextInt(); //x에 정숫값을 저장한다.

        System.out.print("y의 값: "); //y값의 입력 메시지
        int y = stdIn.nextInt(); //y에 정숫값을 저장한다.

        System.out.print(x + y); //x에 y를 더한 값
        System.out.print(x - y); //x에 y를 뺀 값
        System.out.print(x * y); //x에 y를 곱한 값
        System.out.print(x / y); //x를 y로 나눈 몫
        System.out.print(x % y); //x를 y로 나눈 나머지


        System.out.println("x의 부호를 반대로 한 값은"+-x+"입니다.");
        System.out.println("x와 y의 평균은 "+(x+y)/2+"입니다.");


        System.out.println("13+57 = "+13+57);
        System.out.println("13+57 = "+(13+57));

        int z = 10;
        System.out.println("z = "+"z");
        System.out.println("z = "+z);

        System.out.println(10-7);
        System.out.println(10*7);
        System.out.println(10/7);
        System.out.println(10%7);

        System.out.println(5/3);
        System.out.println(5/(-3));
        System.out.println((-5)/3);
        System.out.println((-5)/(-3));

        System.out.println(5%3);
        System.out.println(5%(-3));
        System.out.println((-5)%3);
        System.out.println((-5)%(-3));

    }
}
