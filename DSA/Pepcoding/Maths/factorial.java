package DSA.Pepcoding.Maths;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int res=1;
        for (int i=n; i>0; i--){
            res*=i;
        }
        System.out.println(res);
    }
}
