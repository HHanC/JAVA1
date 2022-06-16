package 알쏭달쏭자바200제.Day3;

import java.util.Scanner;

public class 문제26 { //3-5
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값:");
        int n = stdIn.nextInt();

        if(n > 0)
            System.out.println("값이 양수입니다.");
        else if (n < 0)
            System.out.println("값이 음수입니다.");
        else
            System.out.println("값이 0입니다.");

    }
}
