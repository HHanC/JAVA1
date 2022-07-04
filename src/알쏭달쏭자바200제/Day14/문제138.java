package 알쏭달쏭자바200제.Day14;

import java.util.Scanner;

public class 문제138 {

    static int min(int a , int b){
        return a < b ? a : b;
    }
    static int min(int a, int b, int c){
        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;
        return min;
    }
    static int min(int[] a){
        int min = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("x값 : "); int x = scanner.nextInt();
        System.out.println("y값 : "); int y = scanner.nextInt();
        System.out.println("z값 : "); int z = scanner.nextInt();
        System.out.println("배열 a의 요소 수 : ");
        int num = scanner.nextInt();
        int[] a = new int[num];
        for(int i = 0; i < num; i++){
            System.out.println("a["+i+"] : ");
            a[i] = scanner.nextInt();
        }
        System.out.println("x, y의 최솟값은" + min(x,y) + "입니다.");
        System.out.println("x, y, z의 최솟값은" + min(x,y,z) + "입니다.");
        System.out.println("배열 a의 최솟값은" + min(a) + "입니다.");
    }
}
