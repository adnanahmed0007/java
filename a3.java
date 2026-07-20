 import java.util.*;

class a3 {
    public int Solve(String s) {

        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    max = Math.max(max, i - st.peek());
                }
            }

        }
        return max;

    }

}

class main {
    public static void main(String[] args) {
        a3 k = new a3();
       System.out.println(k.Solve("()"));
      System.out.println(k.Solve("(()))"));
      System.out.println(k.Solve(""));
    }
}
