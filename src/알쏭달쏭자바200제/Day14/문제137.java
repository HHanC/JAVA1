package 알쏭달쏭자바200제.Day14;

import java.util.Scanner;

public class 문제137 {

    static int[][] aryClone2(int[][] a){
        int[][] c = new int[a.length][];
        for(int i = 0; i < a.length; i++){
            c[i] = new int[a[i].length];
            for(int j = 0; j < a[i].length; j++){
                c[i][j] = a[i][j];
            }
        }
        return c;
    }
    static void printMatrix(int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.println(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("행렬의 행 수 : "); int height = scanner.nextInt();
        System.out.println("행렬의 열 수 : "); int width = scanner.nextInt();

        int[][] a = new int[height][width];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        int[][] ca = aryClone2(a);
        System.out.println("행렬a");
        printMatrix(a);

        System.out.println("행렬a의 복사본");
        printMatrix(ca);
    }


}












