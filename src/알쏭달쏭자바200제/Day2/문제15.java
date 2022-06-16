package 알쏭달쏭자바200제.Day2;

import java.util.Scanner;

public class 문제15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.1416;

        System.out.println("구의 겉넓이와 부피를 구합니다.");
        System.out.print("반지름 : "); // 반지름 입력 메시지
        double r = scanner.nextDouble(); // r에 실숫값을 입력 받은

        System.out.println("겉넓이는 "+(4 * PI * r * r)+"입니다.");
        System.out.println("부피는 "+(4/3.0 * PI * r * r * r)+"입니다.");
    }

}

