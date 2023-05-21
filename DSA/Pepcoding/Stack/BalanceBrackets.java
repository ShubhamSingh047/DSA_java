package DSA.Pepcoding.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBrackets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')' || ch == '}' || ch == ']') {
                st.push(ch);
            } else {
                if (ch == ')' && st.peek() == '(') {
                    st.pop();
                }
                if (ch == '}' && st.peek() == '{') {
                    st.pop();
                }
                if (ch == ']' && st.peek() == '[') {
                    st.pop();
                }
            }
        }
        if (st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}