package 알쏭달쏭자바200제.Day13;

import java.util.Scanner;

public class 문제123 { // 7-15
    static int sumOf(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum;
    }

    static int sumOf2(int[] a){
        int sum = 0;
        for (int i : a)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 수");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("x["+i+"]:");
            x[i] = stdIn.nextInt();
        }
        System.out.println("모든 요소의 합은"+sumOf(x)+"입니다.");
    }
}
