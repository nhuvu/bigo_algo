/**
 * https://codeforces.com/problemset/problem/520/A
 * */
package MidTerm;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String words = scanner.nextLine();
        String up = words.toUpperCase();
        char[] alphabets = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        boolean flag = true;
        for(int i = 0; i < alphabets.length; i++){
            if(up.indexOf(alphabets[i]) == -1){
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "YES" : "NO");
    }
}
