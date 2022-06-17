package 알쏭달쏭자바200제.Day3;

public class 문제21 {
    public static void main(String[] args) {
        // public : 모든 곳에서 접근이 가능하다.
        // static : 메모리에 한 번 할당되어 프로그램이 종료될 때 헤제된다.
        // void : 리턴값이 없다.
        // String[] args : 문자열을 배열로 사용한다.

        //초기화
        String s1 = "ABC"; // s1 문자형 변수에 문자 담기
        String s2 = "XYZ"; // s2 문자형 변수에 문자 담기

        System.out.println("문자열 s1은"+s1+"입니다"); // s1변수 출력
        System.out.println("문자열 s2은"+s2+"입니다"); // s2변수 출력

        s1 = "FBI"; //대입(값 변경)
        System.out.println("문자열 s1은"+s1+"입니다"); // s1변수 출력
        System.out.println("문자열 s2은"+s2+"입니다"); // s2변수 출력

    }
}
