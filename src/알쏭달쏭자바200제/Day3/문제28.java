package 알쏭달쏭자바200제.Day3;

import java.util.Scanner;

public class 문제28 { //3-7
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        //읽은 정숫값의 대소 관계를 표시
        System.out.print("변수 A : "); int a = stdIn.nextInt();
        System.out.print("변수 B : "); int b = stdIn.nextInt();

        if(a > b)
            System.out.println("a가 크다");
        else if(a < b)
            System.out.println("b가 크다");
        else
            System.out.println("a와 b가 같다.");


        //읽은 정숫값의 대소 관계를 표시(틀린 버전)
        System.out.print("변수 A : "); int c = stdIn.nextInt();
        System.out.print("변수 B : "); int d = stdIn.nextInt();

        int diff = c - d;
        if(diff > 0)
            System.out.println("a가 크다");
        else if(diff < 0)
            System.out.println("b가 크다");
        else
            System.out.println("a와 b가 같다.");

    }
}
