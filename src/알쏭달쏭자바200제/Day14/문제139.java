package 알쏭달쏭자바200제.Day14;

import java.util.Scanner;

public class 문제139 {
    static int absolute(int x){
        return x >= 0? x : -x;
    }
    static long absolute(long x){
        return x >= 0? x : -x;
    }
    static float absolute(float x){
        return x >= 0? x : -x;
    }
    static double absolute(double x){
        return x >= 0? x : -x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("int 형 정수 a의 값 : "); int a = scanner.nextInt();
        System.out.println("long 형 정수 b의 값 : "); int b = scanner.nextInt();
        System.out.println("float 형 정수 c의 값 : "); int c = scanner.nextInt();
        System.out.println("double 형 정수 d의 값 : "); int d = scanner.nextInt();

        System.out.println("a의 절댓값은 " + absolute(a) + "입니다.");
        System.out.println("b의 절댓값은 " + absolute(b) + "입니다.");
        System.out.println("c의 절댓값은 " + absolute(c) + "입니다.");
        System.out.println("d의 절댓값은 " + absolute(d) + "입니다.");

    }
}
