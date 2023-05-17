import java.util.*;

public class TestingPurpose {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                System.out.println(i);
                for(int j=i*i; j<=n; j=j+i){
                    isPrime[j]=false;
                }
            }
        }
    }
}
