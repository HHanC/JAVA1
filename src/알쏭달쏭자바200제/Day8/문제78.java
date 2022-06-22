package 알쏭달쏭자바200제.Day8;

import java.util.Random;
import java.util.Scanner;

public class 문제78 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        final int MAX_NO = 6; // 최대 입력 횟수
        int lefNo = MAX_NO; // 남은 횟수
        int no = random.nextInt(100); // 맞춰야 하는 숫자 : 0~99의 난수 생성

        System.out.println("숫자 맞추기 게임 시작!");
        System.out.println("0부터 99사이의 숫자를 맞추세요.");

        int x;
        do{
            System.out.println("남은 횟수" + (lefNo--) +"회, 어떤 숫자일까? : ");
            x = scanner.nextInt();

            if(x > no){
                System.out.println("더 작은 숫자 입니다.");
            }else if(x < no){
                System.out.println("터 큰 숫자 입니다.");
            }
        }while(x != no && lefNo > 0);

        if(x == no){
            System.out.print((MAX_NO - lefNo) + "회만에 맞추었습니다.");
        }else{
            System.out.print("아쉽네요. 정답은" + no + "입니다.");
        }

    }

}
