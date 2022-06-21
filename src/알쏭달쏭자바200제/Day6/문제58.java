package 알쏭달쏭자바200제.Day6;

import java.util.Scanner;

public class 문제58 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.print("양의 정숫값 : ");
            n = scanner.nextInt();
        } while(n <= 0);

        int factorial = 1;
        int i = 1;

        while(i <= n){
            factorial *= i; // factorial에 i곱하기
            i++;            // i 증가
        }
        System.out.println("1부터" +n+ "까지의 곱은"+factorial+"입니다.");
    }

}
