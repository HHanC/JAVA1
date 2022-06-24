package 알쏭달쏭자바200제.Day9;

public class 문제86 { // 5-8
    public static void main(String[] args) {
        System.out.println("flaot       int");
        System.out.println("---------------");

        float x = 0.0F;
        for(int i = 0; i <- 100; i++, x += 0.001F)
            System.out.printf("%9.7f     %9.7f\n", x, (float)i / 1000);
    }
}
