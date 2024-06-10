/**
 * https://codeforces.com/problemset/problem/448/B
 * */

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
