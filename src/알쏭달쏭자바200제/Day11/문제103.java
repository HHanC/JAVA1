package 알쏭달쏭자바200제.Day11;

import java.util.Random;
import java.util.Scanner;

public class 문제103 {// 6-16
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        String[] dayKorean = {"일","월","화","수","목","금","토"};
        String[] dayEnglish = {
                "sunday","monday","tuesday","wednesday","thursday","friday","saturday" };

        System.out.println("요일명을 영어 소문자로 입력하시오.");

        int retry; //다시 한 번
        int last = -1; //이전 월

        do {
            int day;
            do{
                day = rand.nextInt(7);
            } while (day == last);
            last = day;

            while (true){
                System.out.print(dayKorean[day]+"요일:");
                String s = stdIn.next();

                if(s.equals(dayEnglish[day])) break;
                System.out.println("틀렸습니다.");
            }
            System.out.print("정답입니다. 다시 한 번? 1-yes 2-no");
            retry = stdIn.nextInt();
        } while (retry == 1);

    }
}
