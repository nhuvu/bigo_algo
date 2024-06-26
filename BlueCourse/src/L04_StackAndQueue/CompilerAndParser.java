/**
 * https://www.codechef.com/problems/COMPILER
 * */
package L04_StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class CompilerAndParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[rows];
        for(int i = 0; i < rows; i++){
            strings[i] = scanner.nextLine();
        }
        printLongestPrefix(strings);
    }

    public static void printLongestPrefix (String[] strings){
        for (String s : strings){
            char[] chars = s.toCharArray();
            int longest = 0;
            Stack<Character> stackChar = new Stack<>();
            for(int i = 0; i < chars.length; i++){
                if(chars[0] == '>'){
                    break;
                } else {
                    if(chars[i] == '<'){
                        stackChar.push(chars[i]);
                    }
                    if(chars[i] == '>'){
                        if(!stackChar.isEmpty()){
                            stackChar.pop();
                            longest += 2;
                        }
                    }
                }
            }
            System.out.println(longest);
        }
    }


}
