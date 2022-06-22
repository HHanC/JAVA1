package 알쏭달쏭자바200제.Day7;

import java.util.Scanner;

public class 문제66 { //4-18
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("몇 개의 *를 표시할까요?");
        int n = stdIn.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++)
            if(n % 1 == 0){
                System.out.print(i + "");
                count++;
            }
        System.out.println("\n의 약수는 "+count+"개 입니다.");

    }
}
