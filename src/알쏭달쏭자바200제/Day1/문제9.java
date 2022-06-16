package 알쏭달쏭자바200제.Day1;

public class 문제9 {
    public static void main(String[] args) {

        //방법1
        int x, y, z;

        x = 63;
        y = 18;
        z = 52;

        System.out.println("x값은"+x+"입니다.");
        System.out.println("y값은"+y+"입니다.");
        System.out.println("z값은"+z+"입니다.");
        System.out.println("합계는"+(x+y+z)+"입니다.");
        System.out.println("평균은"+(x+y+z)/2+"입니다.");


        //방법2
        int a, b, c;
        int sum;

        a = 63;
        b = 18;
        c = 52;
        sum = a + b + c;

        System.out.println("a값은"+a+"입니다.");
        System.out.println("b값은"+b+"입니다.");
        System.out.println("c값은"+c+"입니다.");
        System.out.println("합계는"+(sum)+"입니다.");
        System.out.println("평균은"+(sum)/2+"입니다.");

    }
}
