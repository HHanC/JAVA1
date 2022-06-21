package 알쏭달쏭자바200제.Day6;

import java.util.Scanner;

public class 문제60 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("카운트다운 합니다.");
        int x;
        do{
            System.out.print("양의 정숫값 : ");
            x = scanner.nextInt();
        } while(x <= 0);

        for(; x>=0; x--){
            System.out.println(x);
        }

    }

}
