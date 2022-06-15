package 알쏭달쏭자바200제;

import java.util.Random;
import java.util.Scanner;

public class 문제17 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("정숫값 : ");
        int x = scanner.nextInt();

        System.out.println("입력 값의 ±5 범위의 난수를 생성했습니다.");
        System.out.println("값은 "+(x-5 + random.nextInt(11))+"입니다.");
    }

}
