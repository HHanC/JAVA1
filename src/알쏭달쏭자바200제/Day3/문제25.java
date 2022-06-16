package 알쏭달쏭자바200제.Day3;

import java.util.Scanner;

public class 문제25 { //3-4
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("변수 A : "); int a = stdIn.nextInt();
        System.out.print("변수 B : "); int b = stdIn.nextInt();

        if(!(a % b == 0))
            System.out.println("B는 A의 약수가 아닙니다.");
        else
            System.out.println("B는 A의 약수입니다.");

    }
}
