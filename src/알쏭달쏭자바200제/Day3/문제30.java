package 알쏭달쏭자바200제.Day3;

import java.util.Scanner;

public class 문제30 { //3-9
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값 : ");
        int n = stdIn.nextInt(); // int형 변수 n에 데이터 입력

        if(n>0) // n이 0보다 크다면
            if(n % 10 == 0) // 10의배수
                System.out.println("이 값은 10의 배수 입니다.");
            else // 위 조건이 아니면
                System.out.println("이 값은 10의 배수가 아닙니다.");
        else // n이 0보다 작다면
            System.out.println("음의 정숫값을 입력했습니다.");

    }
}
