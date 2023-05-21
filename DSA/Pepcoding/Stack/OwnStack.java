package DSA.Pepcoding.Stack;

public class OwnStack {
    public static void main(String[] args) {
        CoustomeStack st = new CoustomeStack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(50);
        st.pop();
        st.size();
        System.out.println(st+" stack");
        st.isEmpty();
    }
}
