package 알쏭달쏭자바200제.Day3;

import java.util.Scanner;

public class 문제28 { //3-7
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        //읽은 정숫값의 대소 관계를 표시
        System.out.print("변수 A : "); int a = stdIn.nextInt(); // int형 변수 a에 데이터 입력
        System.out.print("변수 B : "); int b = stdIn.nextInt(); // int형 변수 b에 데이터 입력

        if(a > b) // 만약에 a가 b보다 크다면
            System.out.println("a가 크다");
        else if(a < b) // 위 조건이 아니고 a가 b보다 작다면
            System.out.println("b가 크다");
        else // 위 조건이 아니면
            System.out.println("a와 b가 같다.");


        //읽은 정숫값의 대소 관계를 표시(틀린 버전)
        System.out.print("변수 A : "); int c = stdIn.nextInt(); // int형 변수 c에 데이터 입력
        System.out.print("변수 B : "); int d = stdIn.nextInt(); // int형 변수 b에 데이터 입력

        int diff = c - d; // int형 diff에 c-d의 결과값을 저장
        if(diff > 0) // diff의 값이 0보다 크다면
            System.out.println("a가 크다");
        else if(diff < 0) // diff의 값이 0보다 작다면
            System.out.println("b가 크다");
        else // 위 조건이 아니면
            System.out.println("a와 b가 같다.");

    }
}
