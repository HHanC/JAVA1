package 알쏭달쏭자바200제.Day1; // 프로젝트 명

public class 문제9 { // 클래스 명
    public static void main(String[] args) {
        // public : 모든 곳에서 접근이 가능하다.
        // static : 메모리에 한 번 할당되어 프로그램이 종료될 때 헤제된다.
        // void : 리턴값이 없다.
        // String[] args : 문자열을 배열로 사용한다.

        //방법1
        int x, y, z;
        // 숫자형 x, y, z 변수 선언

        x = 63; // 변수 x에 데이터 담기
        y = 18; // 변수 y에 데이터 담기
        z = 52; // 변수 z에 데이터 담기

        System.out.println("x값은"+x+"입니다."); // 변수 x출력
        System.out.println("y값은"+y+"입니다."); // 변수 y출력
        System.out.println("z값은"+z+"입니다."); // 변수 z출력
        System.out.println("합계는"+(x+y+z)+"입니다."); // 변수 x+y+z출력
        System.out.println("평균은"+(x+y+z)/2+"입니다."); // 변수 x+y+z/2 출력


        //방법2
        int a, b, c;
        // 숫자형 변수 a, b, c 선언
        int sum;
        // 숫자형 변수 sum선언

        a = 63; // 변수 a에 데이터 담기
        b = 18; // 변수 b에 데이터 담기
        c = 52; // 변수 c에 데이터 담기
        sum = a + b + c; // sum변수에 변수 a + b + c의 값 담기

        System.out.println("a값은"+a+"입니다."); // 변수 a의 값 출력
        System.out.println("b값은"+b+"입니다."); // 변수 b의 값 출력
        System.out.println("c값은"+c+"입니다."); // 변수 c의 값 출력
        System.out.println("합계는"+(sum)+"입니다."); // 변수 sum의 값 출력
        System.out.println("평균은"+(sum)/2+"입니다."); // 변수 sum/2의 값 출력

    }
}
