package DSA.Pepcoding.Maths;
import java.util.*;

/*

Given number N return true if number can be expressed as sum of 2
prime number:-
eg:-
i/p 34
o/p true(31,3)

I/P:-23
o/p:- false

 */
public class PrimeSum {
    public static Boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        for(int i=2; i*i<=n; i++){
            int temp=n-i;
            if(isPrime(temp) && isPrime(i)){
                System.out.println(temp+" "+i+" "+isPrime(temp));
                System.out.println(true);
                break;
            };
        }
    }
}
