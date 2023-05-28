package DSA.Pepcoding.Maths;

import java.util.Scanner;

public class ReversNumbK {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt();
        System.out.println("enter the k");
        int k=s.nextInt();
        int dig=1;
        int mul=1;
        int nod=0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            nod++;
        }

        if(k<0){
            k=k%nod;
        }

        for(int i=0; i<nod; i++){
            if(i<k){
                mul=mul*10;
            }else{
                dig*=10;
            }
        }

        int q = n/mul;
        int r = n%mul;

        int res= r*dig+q;
        System.out.println(res);
    }
}
