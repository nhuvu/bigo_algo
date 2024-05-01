package Recursion;

import java.util.Scanner;

public class BiggestOddDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(biggestOddDiv(n));
    }

    public static int biggestOddDiv (int n){
        if(n % 2 != 0){
            return n;
        } else {
            return biggestOddDiv(n / 2);
        }
    }
}
