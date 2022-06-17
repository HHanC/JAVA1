package 알쏭달쏭자바200제.Day4;

import java.util.Scanner;

public class 문제36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 a : "); int a = scanner.nextInt();
        System.out.print("정수 b : "); int b = scanner.nextInt();

        int diff;
        if(a >= b){
            diff = a-b;
        }else{
            diff = b-a;
        }
        System.out.println("두 값의 차는 "+diff+" 입니다.");
    }

}
