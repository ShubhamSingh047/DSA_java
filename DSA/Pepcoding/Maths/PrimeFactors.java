package DSA.Pepcoding.Maths;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                System.out.println(i);
                if(n/i!=i){
                    System.out.println(n/i);
                }
            }
        }
    }
}
