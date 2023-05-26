package DSA.Pepcoding.Stack;

public class LongestReactangle {
    public static void main(String[] args) {
        int[] arr={6,2,5,4,1,5,6};
        int res=0; int n=arr.length;
        for (int i=0; i<n; i++){
            int cres=arr[i];
            for(int j=i-1; j>=0; j--){
                if(arr[j]>=arr[i])cres+=arr[i];
                else break;
            }
            for(int j=i+1; j<n; j++){
                if(arr[j]>=arr[i])cres+=arr[i];
                else break;
            }
            res= Math.max(res, cres);
        }
        System.out.println(res);
    }
}
