package DSA.Pepcoding.Stack;

import java.util.Stack;

public class NSE {
    public static void main(String[] args) {
        int[] arr={2,1,4,3};
        Stack<Integer> st = new Stack<>();
        int[] nse=new int[arr.length];
        nse[arr.length-1]=-1;
        st.push(arr[arr.length-1]);
        for(int i=arr.length-2; i>=0; i--){
            while(!st.isEmpty() && arr[i]<st.peek()){
                st.pop();
            }
            nse[i]=st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
        }
        for(int i:nse){
            System.out.print(i+" ");
        }
    }
}
