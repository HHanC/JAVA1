package 알쏭달쏭자바200제;

import java.util.Scanner;

public class 문제14 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("삼각형의 넓이를 구합니다.");

        System.out.print("밑변 : "); // 밑변의 길이 입력 메시지
        double width = stdIn.nextDouble(); // width에 실숫값을 입력받음

        System.out.print("높이 : "); // 높이 값 입력 메시지
        double height = stdIn.nextDouble(); // height에 실숫값을 입력받음

        // 넓이를 구해서 표시
        System.out.println("넓이는 "+(width * height / 2)+"입니다.");
    }

}
