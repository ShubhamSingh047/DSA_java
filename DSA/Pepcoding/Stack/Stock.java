package DSA.Pepcoding.Stack;

import java.util.Stack;

public class Stock {
    public static void main(String[] args) {
        int[] arr={10,50,30,14,20};
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];
        nge[0]=1;
        st.push(0);
        for (int i=1; i<arr.length; i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]=i+1;
            }else{
                nge[i]=i-st.peek();
            }
            st.push(i);
        }
        for(int i:nge){
            System.out.print(i+" ");
        }
    }
}
