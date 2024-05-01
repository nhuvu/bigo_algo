package Recursion;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.print(0);
        } else {
            decimalToBinary(n);
        }

    }

    public static void decimalToBinary(int num) {
        if (num > 0) {
            decimalToBinary(num / 2);
            int remainder = num % 2;
            System.out.print(remainder);
        }
    }
}
