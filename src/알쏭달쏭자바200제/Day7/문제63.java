package 알쏭달쏭자바200제.Day7;

import java.util.Scanner;

public class 문제63 { //4-15
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("1부터 n까지의 합을 구합니다.");
        int n;
        do{
            System.out.print("n의 값 : ");
            n = stdIn.nextInt();
        } while (n <= 0);
        int sum = 0;
        for(int i = 1 ; i < n ; i++){
            System.out.print(i+" + ");
            sum += i;
        }
        System.out.print(n+" = ");
        sum += n;
        System.out.print(sum);
    }
}
