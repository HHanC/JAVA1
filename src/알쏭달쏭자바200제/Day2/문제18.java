package 알쏭달쏭자바200제.Day2;

import java.util.Random;

public class 문제18 {

    public static void main(String[] args) {
        Random random = new Random();

        double x1 = random.nextDouble(); // 0.0이상 1.0미만의 난수
        double x2 = -1 - random.nextDouble(); // 0.0이상 10.0미만의 난수
        double x3 = -1 + 2 * random.nextDouble(); // -1.0이상 1.0미만의 난수

        System.out.println("3개의 난수를 생성했습니다.");
        System.out.println("0.0이상 1.0미만 : " + x1);
        System.out.println("0.0이상 10.0미만의 난수" + x2);
        System.out.println("-1.0이상 1.0미만의 난수" + x3);
    }

}
