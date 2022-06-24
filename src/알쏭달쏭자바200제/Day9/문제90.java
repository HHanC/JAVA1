package 알쏭달쏭자바200제.Day9;

public class 문제90 { //6-2
    public static void main(String[] args) {
        int[]a = new int[5];

        for(int i = 0; i <a.length; i++)
            a[i] = 5 - i;
        for(int i = 0; i <a.length; i++)
            System.out.println("a["+i+"]="+a[i]);
    }
}
