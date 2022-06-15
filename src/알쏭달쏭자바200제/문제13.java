package 알쏭달쏭자바200제;

import java.util.Scanner;

public class 문제13 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("x값 : "); // x값 입력 메시지
        double x = stdIn.nextDouble(); // 입력한 실숫값을 x에 저장한다.

        System.out.print("y값 : "); // y값 입력 메시지
        double y = stdIn.nextDouble(); // 입력한 실숫값을 y에 저장한다.

        System.out.println("합계는 "+(x+y)+"입니다.");
        System.out.println("평균은 "+(x+y)/2+"입니다.");
    }

}
