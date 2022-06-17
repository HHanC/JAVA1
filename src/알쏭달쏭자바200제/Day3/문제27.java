package 알쏭달쏭자바200제.Day3;

import java.util.Scanner;

public class 문제27 { // 3-6
    public static void main(String[] args) { //3-6
        // public : 모든 곳에서 접근이 가능하다.
        // static : 메모리에 한 번 할당되어 프로그램이 종료될 때 헤제된다.
        // void : 리턴값이 없다.
        // String[] args : 문자열을 배열로 사용한다.

        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값:");
        int n = stdIn.nextInt(); // int형 변수 n에 데이터 입력

        //if문 변경1
        if(n > 0) // 만약에 n이 0보다 크다면
            System.out.println("값이 양수입니다.");
        else if (n < 0) // 위 조건이 아니고 만약에 n이 0보다 작다면
            System.out.println("값이 음수입니다.");
        else if (n == 0) // 위 조건이 아니고 만약에 n과 0이 같다면
            System.out.println("값이 0입니다.");

        //if문 변경2
        if(n == 1) // 만약에 n과 1이 같다면
            System.out.println("이것은 1입니다.");
        else if (n == 2) // 위 조건이 아니고 n과 2와 같다면
            System.out.println("이것은 2입니다.");
        else if (n == 3) // 위 조건이 아니고 n과 3이 가다면
            System.out.println("이것은 3입니다.");

        //if문 변경3
        if(n == 1) // 만약에 n과 1이 같다면
            System.out.println("이것은 1입니다.");
        else if (n == 2) // 위 조건이 아니고 n과 2가 같다면
            System.out.println("이것은 2입니다.");
        else if (n == 3) // 위 조건이 아니고 n과 3이 같다면
            System.out.println("이것은 3입니다.");
        else ; //아무것도 하지 않는다(공문)


    }
}
