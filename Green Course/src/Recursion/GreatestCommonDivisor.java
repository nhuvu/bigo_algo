package Recursion;

import java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd(a,b));
    }

    public static int gcd (int a, int b){
        if(b == 0){
            return a;
        }
        int remainder = a % b;
        return gcd(b, remainder);
    }


}