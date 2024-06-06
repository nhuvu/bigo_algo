package LinkedList.InsertTheIndex;

import java.util.Arrays;
import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();

        System.out.println(cipher(chars));
    }

    public static String cipher(char[] chars){
        int lenghtEven = 0;
        if(chars.length % 2 == 0){
            lenghtEven = chars.length/2;
        } else {
            lenghtEven = chars.length/2 + 1;
        }
        int k = 0; int j = 0;
        char[] even = new char[lenghtEven];
        char[] odd = new char[(chars.length - lenghtEven)];
        for(int i = 0; i < chars.length; i++){
            if((int)chars[i] >= 97 && (int) chars[i] <= 122){
                if(i % 2 == 0){
                    even[k++] = chars[i];
                } else  {
                    odd[j++] = chars[i];
                }
            }
        }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));

        k = 0; j = 0;
        char[] oddReverse = reverse(odd);
        StringBuilder cipher = new StringBuilder();
        for(int i = 0; i < chars.length; i++){
            if(i % 2 == 0){
                cipher.append(even[k++]);
            } else {
                cipher.append(oddReverse[j++]);
            }
        }
        return cipher.toString();
    }

    public static char[] reverse(char[] chars){
        char[] ans = new char[chars.length];
        int k = 0;
        for(int i = chars.length - 1; i >= 0; i--){
            ans[k++] = chars[i];
        }
        return ans;
    }

}
