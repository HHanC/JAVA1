package 알쏭달쏭자바200제.Day8;

import java.util.Scanner;

public class 문제77 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 더합니다.");
        int total = 0; // 전체 그룹의 합계

        Outer :
        for(int i = 0; i<= 10; i++){
            System.out.println("정수 : ");
            int t = scanner.nextInt();
            if(t == 99999){
                break Outer;
            }else if(t == 88888){
                continue Outer;
            }
            total += t;
        }
        System.out.println("\n 합계는 " + total + "입니다.");
    }
}
