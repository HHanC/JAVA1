package 알쏭달쏭자바200제.Day3;

import java.util.Scanner;

public class 문제22 { // 3-1
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수값 :");
        int n = stdIn.nextInt();

        //if-then문 : if(조건식)실행문
        if(n < 0) //n < 0이 true 일때 실행
        System.out.print("이 값은 음의 값입니다.");

    }
}
