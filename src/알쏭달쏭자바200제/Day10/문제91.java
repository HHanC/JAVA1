package 알쏭달쏭자바200제.Day10;

public class 문제91 {

    public static void main(String[] args) {
        double[] a = new double[5]; // 배열 선언

        for(int i = 0; i < a.length; i++){
            a[i] = (i+1) * 1.1;
        }
        for(int i = 0; i < a.length; i++){
            System.out.println("a["+i+"] = "+ a[i]);
        }
    }

}
