package 알쏭달쏭자바200제.Day3;

import java.util.Scanner;

public class 문제27 { // 3-6
    public static void main(String[] args) { //3-6
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값:");
        int n = stdIn.nextInt();

        //if문 변경1
        if(n > 0)
            System.out.println("값이 양수입니다.");
        else if (n < 0)
            System.out.println("값이 음수입니다.");
        else if (n == 0)
            System.out.println("값이 0입니다.");

        //if문 변경2
        if(n == 1)
            System.out.println("이것은 1입니다.");
        else if (n == 2)
            System.out.println("이것은 2입니다.");
        else if (n == 3)
            System.out.println("이것은 3입니다.");

        //if문 변경3
        if(n == 1)
            System.out.println("이것은 1입니다.");
        else if (n == 2)
            System.out.println("이것은 2입니다.");
        else if (n == 3)
            System.out.println("이것은 3입니다.");
        else ; //아무것도 하지 않는다(공문)


    }
}
