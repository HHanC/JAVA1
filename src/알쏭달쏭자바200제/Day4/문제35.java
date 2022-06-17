package 알쏭달쏭자바200제.Day4;

import java.util.Scanner;

public class 문제35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("실수 a : "); double a = scanner.nextDouble();
        System.out.println("실수 b : "); double b = scanner.nextDouble();

        double max = a > b ? a : b;
        System.out.println("큰 쪽의 값은 "+max+"입니다.");
    }

}
