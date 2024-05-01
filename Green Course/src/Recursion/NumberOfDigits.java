package Recursion;

import java.util.Scanner;

public class NumberOfDigits {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.println(1);
        } else {
            System.out.println(numberOfDigits(n));
        }

    }

    public static int numberOfDigits(int n) {
        if(n != 0){
            count++;
            n = n / 10;
            numberOfDigits(n);
        }
        return count;
    }
}
