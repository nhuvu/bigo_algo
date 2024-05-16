package Review;

import java.util.Scanner;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(findFirstRepeatChar(s));
    }

    public static String findFirstRepeatChar(String s){
        int[] freq = new int[130];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)] += 1;
            if(freq[s.charAt(i)] > 1){
                return String.valueOf(s.charAt(i));
            }
        }
        return "null";
    }
}
