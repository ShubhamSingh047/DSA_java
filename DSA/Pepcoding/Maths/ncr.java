package DSA.Pepcoding.Maths;

public class ncr {
    static long nCr(int n, int r)
    {
        // code here
        if(n<r){
            return 0;
        }
        long resn=1;
        for(int i=n; i>0; i--){
            resn*=i;
        }
        long resr=1;
        for(int i=r; i>0; i--){
            resr*=i;
        }
        long resnr=1;
        for(int i=n-r; i>0; i--){
            resnr*=i;
        }
        System.out.println("n fact  :- "+resn);
        System.out.println("r fact  :- "+resn);
        System.out.println("nr fact :- "+resnr);
        return resn/(resnr*resr);
    }
    public static void main(String[] args) {

        // code here
           long res= nCr(15,3);
           System.out.println(res);
    }
}
