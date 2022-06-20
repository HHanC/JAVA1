package 알쏭달쏭자바200제.Day5;

import java.util.Scanner;

public class 문제48 { // 4-2
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x;

        do {
            System.out.println("세 ㅏㅈ리의 정숫값:");
            x = stdIn.nextInt();
        } while (x < 100 || x > 999);

        System.out.println("입력한 값은"+x+"입니다.");
    }
}
