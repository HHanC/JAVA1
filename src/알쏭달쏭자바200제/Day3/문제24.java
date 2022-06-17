package 알쏭달쏭자바200제.Day3;

import java.util.Scanner;

public class 문제24 { //3-3
    public static void main(String[] args) {
        // public : 모든 곳에서 접근이 가능하다.
        // static : 메모리에 한 번 할당되어 프로그램이 종료될 때 헤제된다.
        // void : 리턴값이 없다.
        // String[] args : 문자열을 배열로 사용한다.

        Scanner stdIn = new Scanner(System.in);

        System.out.print("변수 A:"); int a = stdIn.nextInt(); // int형 변수 선언
        System.out.print("변수 B:"); int b = stdIn.nextInt(); // int형 변수 선언

        if(a % b == 0) // 데이터가 0과 같다면
            System.out.print("B는 A의 약수입니다.");
        else // 데이터가 0과 같지 않다면
            System.out.print("B는 A의 약수가 아닙니다.");

    }
}
