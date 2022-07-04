package 알쏭달쏭자바200제.Day14;

import java.util.Scanner;

public class 문제136 {

    static int[][] addMatrix(int[][] x , int[][] y){

        int[][] z = new int[x.length][];
        for(int i = 0; i < x.length; i++){
            z[i] = new int[x[i].length];
            for(int j = 0; j < x[i].length; j++){
                z[i][j] = x[i][j] + y[i][j];
            }
        }
        return z;
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
        System.out.println("행렬의 수 : "); int height = scanner.nextInt();
        System.out.println("행렬의 수 : "); int width = scanner.nextInt();
        int[][] a = new int[height][width];
        int[][] b = new int[height][width];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.printf("a[%d][%d]:", i , j);
                a[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                System.out.printf("b[%d][%d]:", i , j);
                b[i][j] = scanner.nextInt();
            }
        }

        int[][] c = addMatrix(a,b);
        System.out.println("행렬a"); printMatrix(a);
        System.out.println("\n행렬b"); printMatrix(b);
        System.out.println("\n행렬c"); printMatrix(c);

    }

}












