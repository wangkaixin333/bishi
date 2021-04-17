package niukelianxi;

import java.util.Stack;

public class kuohaopipei {
    public boolean isValid (String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char cha : s.toCharArray()) {
            if (cha == '(') {
                stack.push(')');
            } else if (cha == '[') {
                stack.push(']');
            } else if (cha == '{') {
                stack.push('}');
            } else if (stack.empty() || stack.pop() != cha) {
                return false;
            }

        }
        return stack.empty();
    }
}
