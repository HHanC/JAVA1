package 알쏭달쏭자바200제.Day8;

import java.util.Scanner;

public class 문제80 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 : ");
        int x = scanner.nextInt();

        System.out.printf("8진수는 %o입니다.\n" , x);
        System.out.printf("8진수는 %x입니다.\n" , x);
    }


    public static void main2(String[] args) {
        System.out.printf("ABC\n");
        System.out.printf("%d\n" , 12345);
        System.out.printf("%3d\n", 12345);
        System.out.printf("%7d\n", 12345);
        System.out.printf("%5d\n", 123);
        System.out.printf("%05d\n", 123);
    }

}



