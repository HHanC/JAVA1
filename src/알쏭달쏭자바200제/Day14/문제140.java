package 알쏭달쏭자바200제.Day14;

import java.util.Scanner;

public class 문제140 {

    static void printBits(byte x){
        for(int i = 7; i >= 0; i++){
            System.out.println(((x >>> i & 1) == 1) ? '1' : '0');
        }
    }
    static void printBits(short x){
        for(int i = 15; i >= 0; i--){
            System.out.println(((x >>> i & 1) == 1)? '1' : '0');
        }
    }
    static void printBits(int x){
        for(int i = 31; i >= 0; i--){
            System.out.println(((x >>> i & 1) == 1) ? '1' : '0');
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("byte형 정수 a의 값 : "); byte a = scanner.nextByte();
        System.out.println("short형 정수 b의 값 : "); byte b = scanner.nextByte();
        System.out.println("int형 정수 c의 값 : "); byte c = scanner.nextByte();
        System.out.println("long형 정수 d의 값 : "); byte d = scanner.nextByte();

        System.out.println("a의 비트 : "); printBits(a);
        System.out.println("\nn의 비트 : "); printBits(b);
        System.out.println("\nc의 비트 : "); printBits(c);
        System.out.println("\nd의 비트 : "); printBits(d);
        System.out.println();

    }


}
