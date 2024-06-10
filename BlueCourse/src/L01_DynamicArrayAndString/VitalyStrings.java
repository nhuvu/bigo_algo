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
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < charsA.length; i++){
            int charOfA = charsA[i];
            int charOfB = charsB[i];
            if(charOfA == charOfB){
                s.append(charsA[i]);
            }else{
                if(charOfB - charOfA > 1) {
                    char c = (char) (charOfA + 1);
                    s.append(c);
                }else {
                    s.append(charsA[i]);
                }
            }
        }
        if(s.toString().equals(a)){
            System.out.println("No such string");
        }else {
            System.out.println(s);
        }
    }
}
