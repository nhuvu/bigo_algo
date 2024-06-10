/**
 https://codeforces.com/problemset/problem/518/A
 * */
package L01_DynamicArrayAndString;
import java.util.Scanner;

public class VitalyStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        middleStringBetween(a,b);
    }

    public static void middleStringBetween(String a, String b){
        char[] chars = a.toCharArray();
        for(int i = chars.length - 1; i >= 0; i--){
            if(chars[i] == 'z'){
                chars[i] = 'a';
            }else {
                int charI = chars[i];
                charI++;
                chars[i] = (char) charI;
                break;
            }
        }
        String middle = String.valueOf(chars);
        if(!middle.equals(b)){
            System.out.println(middle);
        }else {
            System.out.println("No such string");
        }
    }
}
