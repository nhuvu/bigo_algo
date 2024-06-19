/**
 * https://www.spoj.com/problems/ONP/
 * */
package L04_StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class TransformTheExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfExpression = scanner.nextInt();
        String[] expressions = new String[numOfExpression];
        scanner.nextLine();
        for (int i = 0; i < numOfExpression; i++){
            expressions[i] = scanner.nextLine();
        }

        for(String expression : expressions){
            char[] chars = expression.toCharArray();
            System.out.println(printExpression(chars));
        }
    }

    public static String printExpression(char[] chars){
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        for(char c : chars){
            if(Character.isLetter(c)){
                builder.append(c);
            }
            else if (c == ')') {
                builder.append(stack.pop());
            } else if (c != '(') {
                stack.add(c);
            }
        }
        return builder.toString();
    }
}
