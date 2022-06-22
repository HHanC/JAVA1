package 알쏭달쏭자바200제.Day8;

import java.util.Scanner;

public class 문제74 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 더합니다.");
        System.out.print("몇 개를 더할까요? : ");
        int n = scanner.nextInt(); // 정수의 개수
        int sum = 0;
        int i;
        for(i=0; i<n; i++){
            System.out.println("정수(0으로종료) : ");
            int t = scanner.nextInt();
            if(t == 0){
                break;
            }
            sum += t;
        }
        System.out.println("합계는" + sum + "입니다.");
        if(i != 0){
            System.out.println("평균은" + sum / i + "입니다.");
        }
    }

}
