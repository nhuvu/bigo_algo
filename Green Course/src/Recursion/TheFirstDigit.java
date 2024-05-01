package Recursion;

import java.util.Scanner;

public class TheFirstDigit {
    static int first = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFirst(n);
    }

    public static void printFirst(int n){
        int output;
        if(n / 10 == 0){
            if(n < 0){
                output = n * -1;
            } else {
                output = n;
            }
        } else if (firstDigit(n) < 0) {
            output = firstDigit(n) * -1;
        } else {
            output = firstDigit(n);
        }
        System.out.println(output);
    }
    public static int firstDigit(int n) {
        if(n != 0){
            first = n;
            n = n / 10;
            firstDigit(n);
        }
        return first;
    }
}
