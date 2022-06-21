package 알쏭달쏭자바200제.Day6;

import java.util.Scanner;
//
public class 문제59 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 개의 *를 표시할까요? : ");
        int n = scanner.nextInt();
        if(n > 0){
            for(int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
