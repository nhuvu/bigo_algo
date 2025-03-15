package LeetCode75;

import java.util.ArrayList;
import java.util.List;

/*
* https://leetcode.com/problems/reverse-vowels-of-a-string
* */
public class E_ReverseVowels {
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
       char[] chars = s.toCharArray();
       List<Character> vowels = new ArrayList<>();
       for(char c : chars){
           if(isVowel(c)){
               vowels.add(c);
           }
       }

        for(int i = 0; i < chars.length; i++){
            if(isVowel(chars[i])){
                if (!vowels.isEmpty()){
                    chars[i] = vowels.getLast();
                    vowels.removeLast();
                }
            }
        }
        return new String(chars);
    }

    public static boolean isVowel (char c){
        char[] vowels = new char[] {'A','a','E','e','U','u','I','i','O','o'};
        for(char v : vowels){
            if(c == v){
                return true;
            }
        }
        return false;
    }
}
