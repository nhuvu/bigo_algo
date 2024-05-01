package Recursion;

import java.util.Scanner;

public class LargestDigit {
    static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            n = n * -1;
        }
        System.out.println(largestDigit(n));
    }

    public static int largestDigit(int n){
        if(n != 0){
            int remain = n % 10;
            if(max < remain){
                max = remain;
            }
            largestDigit(n/10);
        }
        return max;
    }
}
