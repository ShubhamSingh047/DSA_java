package DSA.Pepcoding.Stack;

public class LargestRectangleBrute {
    public static void main(String[] args) {
        int res=0;
        int[] arr= {6,2,5,4,1,5,6};
        int n= arr.length;
        for(int i=0; i<n; i++){
            int curr=arr[i];
            for(int j=i-1; j>=0; j--){
                if(arr[j]>=arr[i])curr+=arr[i];
                else break;
            }
            for(int j=i+1; j<n; j++){
                if(arr[j]>=arr[i])curr+=arr[i];
                else break;
            }
            res=Math.max(res,curr);
        }
        System.out.println(res);
    }
}
