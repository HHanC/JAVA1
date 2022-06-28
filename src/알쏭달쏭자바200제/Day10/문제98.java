package 알쏭달쏭자바200제.Day10;

import java.util.Random;
import java.util.Scanner;

public class 문제98 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("요소 수 : ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = 1 + rand.nextInt(10);
        }
        for(int i = 0; i < n; i++){
            System.out.println("a["+i+"] = " + a[i]);
        }
    }

}
