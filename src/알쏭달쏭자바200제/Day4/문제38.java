package 알쏭달쏭자바200제.Day4;

import java.util.Scanner;

public class 문제38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 a : "); int a = scanner.nextInt();
        System.out.println("정수 b : "); int b = scanner.nextInt();

        int diff = a>=b ? a-b : b-a;

        if(diff <= 10){
            System.out.println("두 값의 차는 10이하입니다.");
        }else{
            System.out.println("두 값의 차는 11이상입니다.");
        }
    }

}
