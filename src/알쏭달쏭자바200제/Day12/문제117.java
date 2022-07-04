package 알쏭달쏭자바200제.Day12;

import java.util.Scanner;

public class 문제117 {

    static Scanner scanner = new Scanner(System.in);

    //--- 양의 정숫값을 읽어서 반환 ---//
    static int readPlusInt(){
        int x;
        do{
            System.out.print("양의 정숫값 : ");
            x = scanner.nextInt();
        }while(x <= 0);
        return x;
    }

    public static void main(String[] args) {
        int x;
        do{
            int n = readPlusInt();
            System.out.print("반대로 읽으면");
            while(n > 0){
                System.out.println(n%10);   // n의 마지막 자릿수를 표시
                n /= 10;                    // n을 10으로 나눔
            }
            System.out.print("입니다.");

            do{
                System.out.println("다시 한 번?<Yes...1/No...0 : ");
                x = scanner.nextInt();
            }while(x != 0 && x != 1);
        }while (x == 1);
    }


}
