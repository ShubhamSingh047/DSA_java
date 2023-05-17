package DSA.Pepcoding.Maths;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfErantosthenes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                System.out.println(i);
                for (int j=i*i; j<=n; j+=i){
                    isPrime[j]=false;
                }
            }
        }
    }
}
