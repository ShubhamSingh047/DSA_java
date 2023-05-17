package DSA.Pepcoding.Maths;

import java.util.Scanner;

public class EucladianGcd {
    public static int Gcd(int a, int b){
        if(b==0)return a;
        else{
            return Gcd(b,a%b);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        System.out.println(Gcd(n1,n2));
    }
}
