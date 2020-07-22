package io.fosdick.leetcode.questions.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20. Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 *     Open brackets must be closed by the same type of brackets.
 *     Open brackets must be closed in the correct order.
 *
 * Note that an empty string is also considered valid.
 */
public class ValidParentheses {

    private HashMap<Character, Character> mappings;

    public ValidParentheses() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    /**
     * Stack
     *   Time Complexity: O(n)
     *   Space Complexity: O(n)
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket
            if (this.mappings.containsKey(c)) {
                // Get the top element of the stack; if the stack is empty, set a dummy value of '!'
                char topElement = stack.empty() ? '!' : stack.pop();

                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }

}
