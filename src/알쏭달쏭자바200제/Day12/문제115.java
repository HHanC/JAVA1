package 알쏭달쏭자바200제.Day12;

import java.util.Scanner;

public class 문제115 {
    //--- 문자c를 n개 연속 표시 ---//
    static void putChars(char c, int n){
        while(n-->0){
            System.out.println(c);
        }
    }
        //--- 문자 '*'를 n개 연속 표시 ---//
        static void putStars(int n){
            putChars('*' , n);
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는 : ");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            putStars(i);
            System.out.println();
        }
    }

/*    // -- 참고 : 문제 4-22로부터
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.println('*');
        }
        System.out.println();
    }*/

}
