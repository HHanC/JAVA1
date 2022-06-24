package 알쏭달쏭자바200제.Day9;

import java.util.Scanner;

public class 문제81 { //5-3
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("변수 x는 float형입니다. 변수 y는 double형입니다.");
        System.out.print("x :");
        float x = stdIn.nextFloat();
        System.out.print("y :");
        double y = stdIn.nextDouble();

        System.out.print("x ="+x);
        System.out.print("x ="+y);
    }
}
