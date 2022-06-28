package 알쏭달쏭자바200제.Day10;

import java.util.Scanner;

public class 문제96 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("요소 수 : ");
        int n = scanner.nextInt();          // 요소 수 입력
        int[] a = new int[n];               // 배열 생성

        for(int j = 0; j < n; j++){
            System.out.println("a["+j+"] : ");
            a[j] = scanner.nextInt();
        }
        System.out.println("찻을 숫자 :");
        int key = scanner.nextInt();

        int i;
        for(i = 0; i < n; i++){
            if(a[i] == key){
                break;
            }
            if(i < n){
                System.out.println("그 값은 a["+i+"]에 있습니다.");
            }else{
                System.out.println("해당 값이 존재하지 않습니다.");
            }
        }

    }

}
