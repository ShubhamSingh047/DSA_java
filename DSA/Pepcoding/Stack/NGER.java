package DSA.Pepcoding.Stack;

import java.util.Stack;

public class NGER {
    public static int[] Updated(int arr[]){
        int[] ngr=new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        ngr[arr.length-1]=-1;
        for(int i=arr.length-2; i>=0; i--) {
            while (!st.isEmpty() && arr[i] > st.peek()) {
                st.pop();
            }
            if (st.isEmpty()) {
                ngr[i] = -1;
            }else{
                ngr[i]=st.peek();
            }

            st.push(arr[i]);
        }
        return ngr;
    }
    public static void main(String[] args) {
        int[] arr ={15,15,10,8,6,12,9,18,25};
        int[] res =Updated(arr);
        for(int i:res)
            System.out.print(i+" ");
    }
}
