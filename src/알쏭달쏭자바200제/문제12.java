package 알쏭달쏭자바200제;

import java.util.Scanner;

public class 문제12 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정숫값 : ");
        int x = stdIn.nextInt(); // 입력받은 정숫값을 x에 저장한다.

        System.out.println("마지막 자릿수를 제외한 값은 "+(x/10)+"입니다.");
        System.out.println("마지막 자릿수는 "+(x%10)+"입니다.");
    }

}
