package 알쏭달쏭자바200제.Day2;

import java.util.Scanner;

public class 문제11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정숫값 : ");
        int x = stdIn.nextInt(); // x에 입력받은 정숫값을 저장한다.

        System.out.println("10을 더한 값은 "+(x + 10)+"입니다.");
        System.out.println("10을 뺀 값은 "+(x - 10)+"입니다.");
    }
}
