package 알쏭달쏭자바200제.Day4;

// 읽은 2개의 실숫값 중에서 큰 쪽을 표시(방법1 : if문)
import java.util.Scanner;

public class 문제34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("실수 a : "); double a = scanner.nextDouble();
        System.out.print("실수 b : "); double b = scanner.nextDouble();

        double max; // 큰 값을 저장
        if(a > b){
            max = a;
        }else{
            max = b;
        }
        System.out.println("큰 쪽의 값은 "+max+"입니다.");
    }

}
