package 알쏭달쏭자바200제.Day3;

import java.util.Scanner;

public class 문제29 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값 : ");
        int n = stdIn.nextInt();

        if(n>0) // n이 0보다 크다면
            if(n % 5 == 0)  // n % 5
                System.out.println("이 값은 5로 나누어집니다.");
            else // 위 조건이 아니면ㄴ
                System.out.println("이 값은 5로 나누어지지 않습니다.");
        else // n에 0보다 작다면
            System.out.println("음의 정숫값을 입력했습니다.");

    }
}
