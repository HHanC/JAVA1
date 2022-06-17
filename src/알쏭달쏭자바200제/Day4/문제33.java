package 알쏭달쏭자바200제.Day4;

import java.util.Scanner;

public class 문제33 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("점수 : ");
        int point = scanner.nextInt();

        if(point < 0 || point > 100){
            System.out.println("잘못된 점수 입니다.");
        }else if(point <= 49){
            System.out.println("가");
        }else if(point <= 59){
            System.out.println("양");
        }else if(point <= 69){
            System.out.println("미");
        }else if(point <= 79){
            System.out.println("우");
        }else{
            System.out.println("수");
        }

    }

}
