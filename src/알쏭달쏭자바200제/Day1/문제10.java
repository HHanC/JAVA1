package 알쏭달쏭자바200제.Day1; // 프로젝트 명

import java.util.Scanner; // Scanner : 사용자에게 입력받을 때 사용됌(문자, 숫자 등등)

public class 문제10 {
    public static void main(String[] args) {
        // public : 모든 곳에서 접근이 가능하다.
        // static : 메모리에 한 번 할당되어 프로그램이 종료될 때 헤제된다.
        // void : 리턴값이 없다.
        // String[] args : 문자열을 배열로 사용한다.

        Scanner stdIn = new Scanner(System.in); // Scanner : 사용자에게 입력받을 때 사용됌(문자, 숫자 등등)
        // Scanner클래스를 stdIn객체에 담는다.

        System.out.print("정수값 : "); // 한 줄 문자 출력
        int x = stdIn.nextInt(); // 사용자에게 int형 데이터를 입력받는다.(입력받은 값은 변수 x에 저장됌)
        System.out.println(x+"를 입력했습니다."); // 입력받는 값, 변수 x를 출력한다.

    }
}
