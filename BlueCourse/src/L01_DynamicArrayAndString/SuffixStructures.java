/**
 * At a competition the "Bizons" got the following problem:
 * "You are given two distinct words (strings of English letters),s & t. You need to transform word s into t.
 *The task looked simple to the guys because they know the suffix data structures well.
 * Bizon Senior loves suffix automaton. By applying it once to a string, he can remove from this string any single character.
 * Bizon Middle knows suffix array well. By applying it once to a string, he can swap any two characters of this string. The guys do not know anything about the suffix tree, but it can help them do much more.
 *
 * Bizon the Champion wonders whether the "Bizons" can solve the problem. Perhaps, the solution do not require both data structures.
 * Find out whether the guys can solve the problem and if they can, how do they do it? Can they solve it either only with use of suffix automaton or only with use of suffix array or they need both structures? Note that any structure may be used an unlimited number of times, the structures may be used in any order.
 *
 *
 * Input Format
 * - The first line contains a non-empty word s. The second line contains a non-empty word t
 * - Words s and t are different. Each word consists only of lowercase English letters. Each word contains at most 100 letters.
 *
 * Output Format
 * In the single line print the answer to the problem:
 * - Print "need tree" (without the quotes) if word s cannot be transformed into word even with use of both suffix array and suffix automaton.
 * - Print "automaton" (without the quotes) if you need only the suffix automaton to solve the problem.
 * - Print "array" (without the quotes) if you need only the suffix array to solve the problem.
 * - Print "both" (without the quotes), if you need both data structures to solve the problem.
 * (It's guaranteed that if you can solve the problem only with use of suffix array, then it is impossible to solve it only with use of suffix automaton. This is also true for suffix automaton.)
 * **/
package L01_DynamicArrayAndString;

import java.util.HashMap;
import java.util.Scanner;

public class SuffixStructures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String origin = scanner.nextLine();
        String transform = scanner.nextLine();
        System.out.println(chooseStructure(origin, transform));
    }

    public static String chooseStructure(String origin, String transform){
        if(needAutomaton(origin, transform)){
            return "automaton";
        }
        if(needArray(origin, transform)){
            return "array";
        }
        if(needBoth(origin, transform)){
            return "both";
        }
        return "need tree";
    }

    public static boolean needAutomaton(String origin, String transform){
        int oIndex = 0, tIndex = 0;
        while (oIndex < origin.length() && tIndex < transform.length()) {
            if (origin.charAt(oIndex) == transform.charAt(tIndex)) {
                tIndex++;
            }
            oIndex++;
        }
        return tIndex == transform.length();
    }

    public static boolean needArray(String origin, String transform){
        boolean flag = false;
        HashMap<Character, Integer> charCountOrigin = countChars(origin);
        HashMap<Character, Integer> charCountTransform = countChars(transform);
        return charCountOrigin.equals(charCountTransform);
    }

    public static boolean needBoth(String origin, String transform){
        if(origin.length() < transform.length()){
            return false;
        }
        HashMap<Character, Integer> charCountOrigin = countChars(origin);
        HashMap<Character, Integer> charCountTransform = countChars(transform);
        for(char c : charCountTransform.keySet()){
            if(charCountTransform.get(c) > charCountOrigin.getOrDefault(c, 0)){
                return false;
            }
        }
        return true;
    }

    public static HashMap<Character, Integer> countChars(String s){
        HashMap<Character, Integer> charCount = new HashMap<>();
        char[] chars = s.toCharArray();
        for(char c : chars){
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        return charCount;
    }
}
