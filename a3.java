import java.util.*;

class a3 {
    public static void main(String[] args) {
        String s = "()";
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.empty()) {
                    st.push(i);
                } else {
                    max = Math.max(max, i - st.peek());
                }
            }

        }
        System.out.print(max);

    }

}