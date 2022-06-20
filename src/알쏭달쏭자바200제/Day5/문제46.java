package 알쏭달쏭자바200제.Day5;

import java.util.Scanner;

public class 문제46 { //3-21
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("몇 월입니까?");
        int month = stdIn.nextInt();

        switch (month){
            case 3:
            case 4:
            case 5: System.out.print("봄"); break;
            case 6:
            case 7:
            case 8: System.out.print("여름"); break;
            case 9:
            case 10:
            case 11: System.out.print("가을"); break;
            case 12:
            case 1:
            case 2: System.out.print("겨울"); break;
            default: System.out.println("그런 월은 없습니다."); break;
        }
    }
}
