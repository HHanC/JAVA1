package 알쏭달쏭자바200제.Day6;

import java.util.Scanner;

public class 문제55 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 개를 표시할까요? : ");
        int n = scanner.nextInt();
        if(n > 0){
            int i = 0;
            while(i < n){
                if(i % 2 == 0){         // i가 짝수이면 '*'를 출력
                    System.out.print("*");
                }else{                  // i가 홀수이면 '+'를 출력
                    System.out.print("+");
                }
                i++;
            }
            System.out.println();
        }
    }

}
