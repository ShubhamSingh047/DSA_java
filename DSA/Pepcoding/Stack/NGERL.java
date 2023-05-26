package DSA.Pepcoding.Stack;

import java.util.Stack;

public class NGERL {
    public static void main(String[] args) {
        int[] arr={1,12,3,4,5};
        int[] ngl=new int[arr.length];
        Stack <Integer> st= new Stack<>();
        st.push(arr[0]);
        ngl[0]=-1;
        for(int i=1; i<arr.length; i++){
            while(!st.isEmpty() && arr[i]>st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ngl[i]=-1;
            }else{
                ngl[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for(int i:ngl){
            System.out.print(i+" ");
        }
    }
}
