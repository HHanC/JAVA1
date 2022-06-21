package 알쏭달쏭자바200제.Day6;

import java.util.Scanner;

public class 문제53 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇개의 *을 표시할까요? : ");
        int n = scanner.nextInt();
        if(n > 0){
            int i = 0;
            while(i < n){
                System.out.print('*');
                i++;
            }
            System.out.println();
        }
    }

}
