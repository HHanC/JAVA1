package 알쏭달쏭자바200제.Day1; // 프로젝트 명

public class 문제8 { // 클래스 명
    public static void main(String[] args) {
        // public : 모든 곳에서 접근이 가능하다.
        // static : 메모리에 한 번 할당되어 프로그램이 종료될 때 헤제된다.
        // void : 리턴값이 없다.
        // String[] args : 문자열을 배열로 사용한다.

//        int x;
//        int y;
        double x; // 실수 형 x변수 선언
        double y; // 실수 형 y변수 선언

        x = 63.4; // x변수에 데이터 담기
        y = 18.3; // y변수에 데이터 담기

        System.out.println("x값은"+x+"입니다."); // 변수 x출력
        System.out.println("y값은"+y+"입니다."); // 변수 y출력
        System.out.println("합계는"+(x+y)+"입니다."); // 변수 x+y출력
        System.out.println("평균은"+(x+y)/2+"입니다."); // 변수 x+y/2출력

    }
}
