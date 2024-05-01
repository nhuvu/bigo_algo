package Recursion;

import java.util.Scanner;

public class FirstPrimeIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(firstPrime(0, array));
    }

    public static int firstPrime(int index, int[] arr){
        int length = arr.length;
        if(index < length){
            if(isPrime(arr[index])){
                return index;
            } else {
                index++;
                return firstPrime(index, arr);
            }
        }
        return -1;
    }

    public static boolean isPrime(int input){
        if (input <= 1) {
            return false;
        }
        int n = (int) Math.sqrt(input);
        for (int i = 2; i <= n ; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
