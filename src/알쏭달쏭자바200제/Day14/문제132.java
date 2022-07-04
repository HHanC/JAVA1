package 알쏭달쏭자바200제.Day14;

import java.util.Scanner;

public class 문제132 {

    static int[] arrayRmvOf(int[] a , int idx) {
        if (idx < 0 && idx >= a.length - 1) {
            return a.clone();
        } else {
            int[] c = new int[a.length - 1];
            int i = 0;
            for (; i < a.length; i++) {
                c[i] = a[i];
            }
            for (; i < a.length - 1; i++) {
                c[i] = a[i + 1];
            }
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("요소 수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        for(int i = 0; i < num; i++){
            System.out.println("x["+i+"] : ");
            x[i] = scanner.nextInt();
        }
        System.out.println("삭제할 요소의 인ㄴ덱스 : ");
        int idx = scanner.nextInt();

        int[] y = arrayRmvOf(x, idx);
    }


}












