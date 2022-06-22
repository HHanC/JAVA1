package 알쏭달쏭자바200제.Day7;

import java.util.Scanner;

public class 문제65 { //4-17
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("몇 개의 *를 표시할까요?");
        int n = stdIn.nextInt();
        if ( n > 0 ){
            for(int i = 0; i < n; i++){
                System.out.print('*');
                if(i % 5 == 4)
                    System.out.println();
            }
            if(n % 5 != 0)
                System.out.println();
        }


        //방법2
        System.out.print("몇 개의 *를 표시할까요?");
        int b = stdIn.nextInt();
        if (b > 0) {
            for (int i = 1; i <= b; i++)
                System.out.println("*****");
            int rest = b % 5;
            if (rest > 0) {
                for (int i = 0; i < rest; i++)
                    System.out.print("*");
                System.out.println();
            }

        }
    }
}
