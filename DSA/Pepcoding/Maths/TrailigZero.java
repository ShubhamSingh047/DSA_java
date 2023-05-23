package DSA.Pepcoding.Maths;

import java.util.Scanner;

public class TrailigZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int res=0;
        for(int i=5; i<=n; i=i*5){
            res += n/i;
        }
        System.out.println(res);
    }
}
