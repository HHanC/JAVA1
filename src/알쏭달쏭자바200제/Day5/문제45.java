package 알쏭달쏭자바200제.Day5;

import java.util.Random;

public class 문제45 { //3-20
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.print("컴퓨터가 낸 것");
        int hand = rand.nextInt(3);

        switch (hand){
            case 0: System.out.print("가위"); break;
            case 1: System.out.print("바위"); break;
            case 2: System.out.print("보"); break;
        }

    }
}
