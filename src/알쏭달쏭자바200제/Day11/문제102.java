package 알쏭달쏭자바200제.Day11;

import java.util.Random;
import java.util.Scanner;

public class 문제102 { //6-15
    public static void main(String[] args) {
        Random  rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        String[] monthString = {
                "January", "February", "March", "April", "May", "June", "july",
                "August", "September", "October", "November", "December"
        };

        System.out.println("해당 월의 영어 단어를 입력하시오.");
        System.out.println("첫 글자는 대문자, 내머지는 소문자로 입력하세요.");

        int retry; //다시 한 번
        int last = -1; //이전 월

        do {
            int month;
            do {
                month = rand.nextInt(12);
            } while (month == last);
            last = month;

            while (true){
                System.out.print((month+1)+"월:");
                String s = stdIn.next();

                if(s.equals(monthString[month])) break;
                System.out.println("틀렸습니다.");
            }
            System.out.print("정답입니다. 다시 한 번? 1-yes 2-no");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }

//    String[] monthString = new String[12];
//    monthString[0] = "January";
//    monthString[1] = "February";
//    //이하생략

}

