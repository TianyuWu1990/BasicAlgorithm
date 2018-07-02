package Amazon;

import java.util.Stack;

public class IsValidParentheses {
    public boolean isValidParentheses(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(getOtherSide(s.charAt(i)));
            }
            if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                return st.pop() == s.charAt(i);
            }
        }
        return st.size() <= 0;
    }

    private Character getOtherSide(Character c){
        if (c == '(') {
            return ')';
        }
        else if (c == '[') return ']';
        else return '}';
    }
}
