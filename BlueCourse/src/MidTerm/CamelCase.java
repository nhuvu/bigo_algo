package MidTerm;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] chars = word.toCharArray();
        int count = 0;
        for(int i = 0; i < chars.length; i++){
            int charInt = chars[i];
            if(charInt >= 65 && charInt <= 90){
                count++;
            }
        }
        System.out.println(count+1);
    }
}
