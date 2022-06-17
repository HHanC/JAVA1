package 알쏭달쏭자바200제.Day4;

import java.util.Scanner;

public class 문제40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 a : "); int a = scanner.nextInt();
        System.out.println("정수 b : "); int b = scanner.nextInt();
        System.out.println("정수 c : "); int c = scanner.nextInt();

        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;

        System.out.println("최솟값은 "+min+"입니다.");
    }

}
