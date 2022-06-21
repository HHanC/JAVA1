package 알쏭달쏭자바200제.Day6;

import java.util.Scanner;

public class 문제56 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 개를 표시할까요? : ");
        int n = scanner.nextInt();
        if(n > 0){
            int i = 0;
            while(i < n / 2){ // n/2개의 "*+"를 출력
                System.out.print("*+");
                i++;
            }
            if(n % 2 == 1){
                System.out.print("*");
            System.out.print("");
            }
        }
    }

}
