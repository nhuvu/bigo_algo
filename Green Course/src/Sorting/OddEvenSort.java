package Sorting;

import java.util.Scanner;

public class OddEvenSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int countEven = 0;
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
            if(arr[i] % 2 == 0){
                countEven++;
            }
        }
        int[] evens = new int[countEven];
        int[] odds = new int[n - countEven];
        int k = 0, l = 0;
        for(int num : arr){
            if(num % 2 == 0){
                evens[k++] = num;
            } else {
                odds[l++] = num;
            }
        }
        k = 0; l = 0;
        insertionSort(evens, countEven, "asc");
        insertionSort(odds, n - countEven, "desc");
        for(int num : arr){
            if(num % 2 == 0){
                System.out.printf("%d ", evens[k++]);
            } else {
                System.out.printf("%d ", odds[l++]);
            }
        }
    }

    public static void insertionSort(int[]a, int n, String sortBy){
        for(int i = 1; i < n; i++){
            int x = a[i];
            if (sortBy.equals("asc")) {
                insertAsc(a, i, x);
            } else if (sortBy.equals("desc")) {
                insertDesc(a, i, x);
            }
        }
    }
    public static void insertAsc (int[]a, int n, int x){
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

    public static void insertDesc (int[]a, int n, int x){
        int j = n;
        while (j > 0){
            if(a[j - 1] >= x){
                break;
            }
            a[j] = a[j - 1];
            j--;
        }
        a[j] = x;
    }
}
