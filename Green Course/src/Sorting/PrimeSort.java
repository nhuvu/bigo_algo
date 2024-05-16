package Sorting;

import java.util.Scanner;

public class PrimeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int countPrime = 0;
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
            if(isPrime(arr[i])){
                countPrime++;
            }
        }
        int[] primes = new int[countPrime];
        int[] nonPrimes = new int[n - countPrime];
        int k = 0, l = 0;
        for(int num : arr){
            if(isPrime(num)){
                primes[k++] = num;
            } else {
                nonPrimes[l++] = num;
            }
        }
        k = 0; l = 0;
        insertionSort(nonPrimes, n-countPrime);
        for(int num : arr){
            if(isPrime(num)){
                System.out.printf("%d ", primes[k++]);
            } else {
                System.out.printf("%d ", nonPrimes[l++]);
            }
        }
    }
    public static void insertionSort(int[] a, int n){
        for(int i = 1; i < n; i++){
            int x = a[i];
            insertAsc(a, i, x);
        }
    }
    public static void insertAsc(int[] a, int n, int x){
        int j = n;
        while (j > 0){
            if(a[j - 1] <= x){
                break;
            }
            a[j] = a[j - 1];
            j--;
        }
        a[j] = x;
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
