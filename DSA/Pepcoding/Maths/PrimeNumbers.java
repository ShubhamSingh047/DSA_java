package DSA.Pepcoding.Maths;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=2; i<n-1; i++){
            if(n%i==0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
