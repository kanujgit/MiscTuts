package com.kdroid.kotlintuts.java.datastructure.stack;

import java.util.Stack;

/**
 * Discuss how stacks can be used for checking balancing of symbols.
 * Solution: Stacks can be used to check whether the given expression has balanced symbols. This
 * algorithm is very useful in compilers. Each time the parser reads one character at a time. If the
 * character is an opening delimiter such as (, {, or [- then it is written to the stack. When a closing
 * delimiter is encountered like ), }, or ]-the stack is popped.
 * The opening and closing delimiters are then compared. If they match, the parsing of the string
 * continues. If they do not match, the parser indicates that there is an error on the line. A linear-time
 * O(n) algorithm based on stack can be given as:
 */
public class BalancedSymbolCheck {

    public static void main(String[] args) {

        String expr = "([{}()])";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

    static boolean areBracketsBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }
            char check;
            switch (ch) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;

            }
        }
        return stack.isEmpty();

    }

}
