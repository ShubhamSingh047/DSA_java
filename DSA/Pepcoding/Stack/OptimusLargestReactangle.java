package DSA.Pepcoding.Stack;

import java.util.Stack;

public class OptimusLargestReactangle {
    public static void main(String[] args) {
        int[] arr={6,2,5,4,1,5,6};
        Stack <Integer> st = new Stack<>();
        st.push(0);
        int res=0;
        int n= arr.length;
        for(int i=1; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                int top = st.pop();
                //this is to find the arr[top] is height & width of stack (i-top-1)
                int curr=arr[top] * (st.isEmpty()?i:i-st.peek()-1);
                res=Math.max(res,curr);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int top=st.pop();
            int curr= arr[top]*(st.isEmpty()?n:n-st.peek()-1);
            res=Math.max(res,curr);
        }
        System.out.println(res);
    }
}
