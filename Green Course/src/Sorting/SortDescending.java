package Sorting;

import java.util.Scanner;

public class SortDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        mergeSort(arr, n);
        for(int num : arr){
            System.out.printf("%d ", num);
        }
    }

    public static void mergeSort(int[] a, int n){
        if(n > 1){
            int nLeft = n / 2;
            int nRight = n - nLeft;
            int[] left = new int[nLeft];
            int[] right = new int[nRight];

            for(int i = 0; i < nLeft; i++){
                left[i] = a[i];
            }
            for(int i = 0; i < nRight; i++){
                right[i] = a[i + nLeft];
            }

            mergeSort(left, nLeft);
            mergeSort(right, nRight);
            merge(left, nLeft, right, nRight, a);
        }
    }

    public static void merge (int[] Left, int leftLength, int[] Right, int rightLength, int[] arr){
        int i,j,k;
        i = j = k = 0;
        while (i < leftLength && j < rightLength){
            if(Left[i] > Right[j]){
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        while (i < leftLength){
            arr[k] = Left[i];
            i++;
            k++;
        }

        while (j < rightLength){
            arr[k] = Right[j];
            j++;
            k++;
        }
    }
}
