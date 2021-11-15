package blind75.blind7;

import java.util.*;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char c;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            c = arr[i];

            if (c == '(')
                stack.push(c);
            else if (c == '{')
                stack.push(c);
            else if (c == '[')
                stack.push(c);
            else if (c == ')')
                if (stack.empty())
                    return false;
                else if (stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            else if (c == '}')
                if (stack.empty())
                    return false;
                else if (stack.peek() == '{')
                    stack.pop();
                else
                    return false;
            else if (c == ']')
                if (stack.empty())
                    return false;
                else if (stack.peek() == '[')
                    stack.pop();
                else
                    return false;
        }
        return stack.empty();
    }
}
