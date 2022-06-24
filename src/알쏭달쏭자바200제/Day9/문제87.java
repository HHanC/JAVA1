package 알쏭달쏭자바200제.Day9;

public class 문제87 { //5-9
    public static void main(String[] args) {
        //방법1
        System.out.println("x             x의 제곱");
        System.out.println("---------------------");

        for(float x = 0.0F; x <= 1.0F; x += 0.001F)
            System.out.printf("%5.3f     %10.7f\n", x, x * x);


        //방법2
        System.out.println("x             x의 제곱");
        System.out.println("---------------------");

        for(int i = 0; i <= 1000; i++) {
            float x = (float) i / 1000;
            System.out.printf("%5.3f     %10.7f\n", x, x * x);
        }
    }
}
