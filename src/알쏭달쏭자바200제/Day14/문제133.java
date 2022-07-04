package 알쏭달쏭자바200제.Day14;

import java.util.Scanner;

public class 문제133 {

    static int[] arrayRmmvOffN(int[] a, int idx, int n) {
        if (n < 0 || idx < 0 || idx > a.length) {
            return a.clone();
        }else {
            if (idx + n > a.length) {
                n = a.length - idx;
            }
            int[] c = new int[a.length - n];
            int i = 0;
            int dix = 0;
            for (; i < dix; i++) {
                c[i] = a[i];
            }
            for (; i < a.length - n; i++) {
                c[i] = a[i + n];
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
            System.out.println("x["+i+"]  : ");
            x[i] = scanner.nextInt();
        }

        System.out.println("삭제를 시작할 인덱스 : ");
        int idx = scanner.nextInt();
        System.out.println("삭제할 요소의 개수 : ");
        int n = scanner.nextInt();

        int[] y = arrayRmmvOffN(x, idx, n);

        for(int i = 0; i < y.length; i++){
            System.out.println("y["+i+"] = " + y[i]);
        }

    }

}
