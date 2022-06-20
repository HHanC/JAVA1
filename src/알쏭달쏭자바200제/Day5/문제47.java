package 알쏭달쏭자바200제.Day5;

import java.util.Scanner;

public class 문제47 { //4-1
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        do {
            System.out.println("정숫값 : ");
            int n = stdIn.nextInt();

            if (n > 0)
                System.out.println("이 값은 양수입니다.");
            else if (n < 0)
                System.out.println("이 값은 음수입니다.");
            else
                System.out.println("이 값은 0입니다.");
            do {
                System.out.println("다시 한번? 1-YES 2-No");
                retry = stdIn.nextInt();
            } while (retry != 0 && retry != 1);
        } while (retry == 1);
    }
}

//