package 알쏭달쏭자바200제.Day3;

import java.util.Scanner;

public class 문제22 { // 3-1
    public static void main(String[] args) {
        // public : 모든 곳에서 접근이 가능하다.
        // static : 메모리에 한 번 할당되어 프로그램이 종료될 때 헤제된다.
        // void : 리턴값이 없다.
        // String[] args : 문자열을 배열로 사용한다.

        Scanner stdIn = new Scanner(System.in); // 스캐너 변수 선언

        System.out.print("정수값 :");
        int n = stdIn.nextInt(); // int형 변수 n에 데이터 입력

        //if-then문 : if(조건식)실행문
        if(n < 0) //n < 0이 true 일때 실행
        System.out.print("이 값은 음의 값입니다.");

    }
}
