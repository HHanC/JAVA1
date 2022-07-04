package 알쏭달쏭자바200제.Day12;

import java.util.Scanner;

public class 문제111 {
    //--- a,b,c의 중간값 반환 ---//
    static int med3(int a , int b , int c){
        if(a >= b){
            if(b >= c){
                return b;
            }else if(a <= c){
                return a;
            }else{
                return c;
            }
        }else if(a > c) {
            return a;
        }else if(b > c){
            return c;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 a : "); int a = scanner.nextInt();
        System.out.print("정수 b : "); int b = scanner.nextInt();
        System.out.print("정수 c : "); int c = scanner.nextInt();

        System.out.println("중간값은 " + med3(a,b,c) + "입니다.");

    }

}
