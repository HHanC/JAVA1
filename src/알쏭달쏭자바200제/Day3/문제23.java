package 알쏭달쏭자바200제.Day3;

import java.util.Scanner;

public class 문제23 { //3-2
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        //방법1
        System.out.print("정수값 :");
        int n = stdIn.nextInt();

        //if(조건식) 실행문 else 실행문
        if (n >= 0) //n >=0 이 true 일때 실행
            System.out.print("절댓값은"+n+"입니다.");
        else //n >=0이 false 일때 실행
            System.out.print("절댓값은"+-n+"입니다.");


        //방법2
        System.out.print("정수값 :");
        int i = stdIn.nextInt();
        int abs;

        //if(조건식) 실행문 else 실행문
        if (i >= 0) //n >=0 이 true 일때 실행
            abs = n;
        else //n >=0이 false 일때 실행
            abs = -n;
        System.out.print("절댓값은"+abs+"입니다.");


    }
}
