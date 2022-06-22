package 알쏭달쏭자바200제.Day7;

import java.util.Scanner;

public class 문제67 { //4-19
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        //방법1
        System.out.print("정수값 :");
        int n = stdIn.nextInt();
        for(int i = 1; i <= n; i++)
            System.out.println(i + "의 제곱은"+i * i+"입니다.");

        //방법2
        System.out.print("정수값 :");
        int n = stdIn.nextInt();
        for(int i = 1; j = 1; i <= n; i++; j = i * i)
            System.out.println(i + "의 제곱은"+j+"입니다.");
    }
}
