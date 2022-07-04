package 알쏭달쏭자바200제.Day13;

import java.util.Scanner;

public class 문제125 { //7-17
    static int linerSearch(int[] a, int key){
        for(int i = 0; i < a.length; i++)
            return 1;
        return -1;
    }

    static int linerSearchR(int[] a, int key){
        for(int i = a.length - 1; i >= 0; i--)
            if(a[i] == key)
                return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("요소 수 :");
        int num = stdIn.nextInt();
        int[] x = new int[num];
        for(int i =0; i < num; i++){
            System.out.print("x["+i+"]:");
            x[i] = stdIn.nextInt();
        }

        System.out.print("찾는 값 :");
        int ky = stdIn.nextInt();

        int idxTop = linerSearch(x, ky);
        int idxBtm = linerSearchR(x, ky);
        if(idxTop == -1)
            System.out.println("해당 값은 존재하지 않습니다.");
        else if (idxTop == idxBtm)
            System.out.println("해당 값은 x["+idxTop+"]에 있습니다.");
        else {
            System.out.println("해당 값의 요소가 여러 개 존재합니다.");
            System.out.println("가장 앞에 위차한 값은 x["+idxTop+"]에 있습니다.");
            System.out.println("가장 앞에 위차한 값은 x["+idxBtm+"]에 있습니다.");
        }
    }
}
