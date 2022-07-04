package 알쏭달쏭자바200제.Day12;

import java.util.Random;
import java.util.Scanner;

public class 문제116 {

    //--- a이상 b이하의 난수 생성 ---//
    static int random(int a , int b){
        if(b <= a)
        return a;
        else{
            Random rand = new Random();
            return a + rand.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("난수를 생성합니다.");
        System.out.print("하한값 : "); int min = scanner.nextInt();
        System.out.print("상한값 : "); int max = scanner.nextInt();

        System.out.println("생성한 난수는 " +random(min, max)+"입니다.");
    }


}
