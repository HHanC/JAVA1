package 알쏭달쏭자바200제.Day12;

import java.util.Scanner;

public class 문제114 {

    static void printSeason(int m){
        switch (m){
            case 3: case 4 : case 5: System.out.println("봄"); break;
            case 6: case 7 : case 8: System.out.println("여름"); break;
            case 9: case 10 : case 11: System.out.println("가을"); break;
            case 1: case 2 : case 12: System.out.println("겨울"); break;

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        do{
            System.out.println("몇 월 입니까(1~12) : ");
            month = scanner.nextInt();
        }while(month < 1 || month > 12);

        System.out.println("해당 월의 계절은");
        printSeason(month);
        System.out.println("입니다.");
    }

    /*return;*/

/*    class SeasonString {
        swich(m) {
            case 3 : case 4 : case 5 : return "봄";
            case 6 : case 7 : case 8 : return "여름";
            case 9 : case 10 : case 11 : return "가을";
            case 1 : case 2 : case 12 : return "겨울";
        }
        return ""; // m이 1~12가 아니면 공백 문자열을 반환
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month;
        do{
            System.out.println("몇 월입니까(1~12) : ");
            month = scanner.nextInt();
        }while (month < 1 || month > 12);
        System.out.println("해당 월의 계정은 "+ seasonOf(month) +"입니다.");
    }*/

}
