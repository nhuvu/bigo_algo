package Recursion;

import java.util.Scanner;

public class SymetricalString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        boolean symetric = isSymetric(s, 0, i -1);
        if(symetric){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isSymetric (String s, int left, int right){
        if(left >= right){
            return true;
        }
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return isSymetric(s, left+1, right-1);
    }
}
