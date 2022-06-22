package 알쏭달쏭자바200제.Day7;

import java.util.Scanner;

public class 문제68 { //문제 4-20
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;
        System.out.println("계절을 찾습니다.");
        do{
            int month;
            do{
                System.out.print("몇 월입니까?");
                month = stdIn.nextInt();
            } while (month < 1 || month > 12);

            if(month >= 3 && month <= 5)
                System.out.println("봅입니다.");
            else if (month >= 6 && month <= 8)
                System.out.println("여름입니다.");
            else if (month >= 9 && month <= 11)
                System.out.println("가을입니다.");
            else if (month == 12 || month == 1 || month == 2)
                System.out.println("여름입니다.");

            System.out.print("다시 하겠습니까? 1_YES 2_No");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
