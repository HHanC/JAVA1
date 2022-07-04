package 알쏭달쏭자바200제.Day12;

import java.util.Scanner;

public class 문제112 {

    //--- 1부터 n까지의 합 ---//
    static int sumUp(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i; // sum에 i를 더한다
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 x까지의 합을 구하자.");
        int x;
        do{
            System.out.print("x의 값 : ");
            x = scanner.nextInt();
        }while(x <= 0);
        System.out.println("1부터 "+x+"까지의 합은 "+sumUp(x)+"입니다.");
    }

/*    class SumUp2 static int sumUp(int n){
        int sum = 0;
        while (n > 0){
            sum += n--;
        }
        return sum;
    }*/

/*    // Ok (n의 값을 변경하지 않는다.)
    static int sumUp(final int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }return sum;
    }*/

/*    // 오류(n의 값을 변경한다.)
    static int sumUp(final int n){
        int sum = 0;
        while(n > 0){
            sum += n--;
        }return sum;
    }*/


}
