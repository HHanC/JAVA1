package 알쏭달쏭자바200제.Day10;

import java.util.Scanner;

public class 문제94 {

    //배열의 모든 요소에 값을 읽어서 초깃값 형식으로 출력

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("요소 수 : ");
        int n = scanner.nextInt();          // 요소 수 입력
        int[] a = new int[n];               // 배열 생성

        for(int i = 0; i < n; i++){
            System.out.println("a["+i+"] : ");
            a[i] = scanner.nextInt();
        }
        System.out.println("a = {");
        if(n >= 2){
            for(int i = 0; i < n - 1; i++){
                System.out.println(a[i] + ", ");
            }
        }
        if(n >= 1){
            System.out.println(a[n-1]);
        }
        System.out.println("}");

    }

}
