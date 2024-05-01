package Recursion;

import java.util.Scanner;

public class DecimalToHex {
    static int remainder = 0;
    static String hex = "";
    static char[] hexchars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.print(0);
        } else {
            System.out.println(decimalToHex(n));
        }

    }

    public static String decimalToHex(int num) {
        if (num != 0) {
            remainder = num % 16;
            hex = hexchars[remainder] + hex;
            num = num / 16;
            decimalToHex(num);
        }
        return hex;
    }
}
