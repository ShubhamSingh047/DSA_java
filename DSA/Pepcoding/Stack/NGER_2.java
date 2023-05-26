package DSA.Pepcoding.Stack;

import java.util.Stack;

public class NGER_2 {
    public static int[] Updated(int[] arr){
        int[] ngr=new int[arr.length];
        Stack<Integer> st= new Stack<>();
        st.push(0);
        for(int i=1; i<arr.length; i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                int pos=st.peek();
                ngr[pos]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int pos=st.peek();
            ngr[pos]=-1;
            st.pop();
        }return ngr;
    }
    public static void main(String[] args) {
        int[] arr={12,9,15,25};
        int[] res=Updated(arr);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
