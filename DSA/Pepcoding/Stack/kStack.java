package DSA.Pepcoding.Stack;

class kStacks{
    int[] arr, top, next;
    int cap, k, freetop;
    kStacks(int k, int n) {
        this.k = k;
        cap = n;
        freetop = 0;
        top = new int[k];
        next = new int[n];
        arr = new int[n];

        for (int i = 0; i < k; i++)
            top[i] = -1;
        for (int i = 0; i < cap - 1; i++)
            next[i] = i + 1;
        next[cap - 1] = -1;
    }

    //for Overflow
    boolean isFull(){
        if(freetop==-1){
            return true;
        }
        return false;
    }

    //to check underFlow;
    boolean isEmpty(int stackNum){
        if(top[stackNum-1]==-1){
            return true;
        }
        return false;
    }
    void push(int x, int stackN){
        if(isFull()){
            System.out.println("stack Overflow for "+stackN+" element "+x);
            return;
        }
        int i=freetop;
        freetop=next[i];
        arr[i]=x;
        //we have done minus one for 0 base indexing
        next[i]=top[stackN-1];
        top[stackN-1]=i;
    }
    int pop(int sn){
        if(isEmpty(sn)){
            System.out.println("stack Underflow for "+ sn);
            return -1;
        }
        int i=top[sn-1];
        top[sn-1]=next[i];
        next[i]=freetop;
        freetop=i;
        return arr[i];
    }

    @Override
    public String toString(){
        StringBuilder st=new StringBuilder();
        for(int i=0; i<arr.length; i++){
            st.append(arr[i]);
            if(i< arr.length-1){
                st.append(',');
            }
        }
        return st.toString();
    }
}


public class kStack {
    public static void main(String[] args) {
        kStacks st = new kStacks(3,6);
        st.push(12,1);
        st.push(11,1);
        st.push(10,1);
        st.push(18,2);
        st.push(22,1);
        st.push(42,3);
        st.push(9,1);
        System.out.println(st.pop(2));
        System.out.println(st.pop(3));
        System.out.println(st.pop(3));

    }
}
