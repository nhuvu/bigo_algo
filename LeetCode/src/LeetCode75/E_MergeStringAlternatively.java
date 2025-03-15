package LeetCode75;

/**
 * https://leetcode.com/problems/merge-strings-alternately
 * */
public class E_MergeStringAlternatively {
    public static void main(String[] args) {

    }
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedWord = new StringBuilder();
        int size = Math.min(word1.length(), word2.length());
        for(int i = 0; i < size; i++){
            mergedWord.append(word1.charAt(i));
            mergedWord.append(word2.charAt(i));
        }
        if(word1.length() > size){
            for(int i = size; i <= word1.length() - 1; i++){
                mergedWord.append(word1.charAt(i));
            }
        }else if(word2.length() > size){
            for(int i = size; i <= word2.length() - 1; i++){
                mergedWord.append(word2.charAt(i));
            }
        }
        return mergedWord.toString();
    }
}
