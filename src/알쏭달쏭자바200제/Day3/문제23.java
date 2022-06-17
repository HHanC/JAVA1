package 알쏭달쏭자바200제.Day3;

import java.util.Scanner;

public class 문제23 { //3-2
    public static void main(String[] args) {
        // public : 모든 곳에서 접근이 가능하다.
        // static : 메모리에 한 번 할당되어 프로그램이 종료될 때 헤제된다.
        // void : 리턴값이 없다.
        // String[] args : 문자열을 배열로 사용한다.

        Scanner stdIn = new Scanner(System.in); // 스캐너 변수 선언

        //방법1
        System.out.print("정수값 :");
        int n = stdIn.nextInt(); // 스캐너 변수 n에 int 데이터 입력

        //if(조건식) 실행문 else 실행문
        if (n >= 0) //n >=0 이 true 일때 실행
            System.out.print("절댓값은"+n+"입니다."); // n이 0보다 작거나 같다면 변수 n의 데이터 출력
        else //n >=0이 false 일때 실행
            System.out.print("절댓값은"+-n+"입니다."); // n이 0보다 크다면 -1데이터 출력


        //방법2
        System.out.print("정수값 :");
        int i = stdIn.nextInt(); // 변수 i에 데이터 입력
        int abs; // 정수형 변수 선언

        //if(조건식) 실행문 else 실행문
        if (i >= 0) //n >=0 이 true 일때 실행
            abs = n;
        else //n >=0이 false 일때 실행
            abs = -n;
        System.out.print("절댓값은"+abs+"입니다.");


    }
}
