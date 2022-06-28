package 알쏭달쏭자바200제.Day10;

import java.util.Random;
import java.util.Scanner;

public class 문제99 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        a[0] = 1+random.nextInt();

        for(int i = 1; i < n; i++){
            do{
                a[i] = 1 + random.nextInt(10);
            }while(a[i] == a[i-1]);
        }
        for(int i = 0; i < n; i++){
            System.out.println("a["+i+"] = " + a[i]);
        }
    }
}
