/**
 * https://codeforces.com/problemset/problem/224/B
 * */
package L02_AlgoComplexity;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int distinctNumber = scanner.nextInt();
        int[] array = new int[arrayLength];
        scanner.nextLine();
        for(int i = 0; i < arrayLength; i++){
            array[i] = scanner.nextInt();
        }

    }

    public static void printMinimalSegment(int n, int[] array, int distinctNum){
        for(int i = 0; i < n; i++){
            int count = 0;
            int l = i;
            int r = i + 1;
        }
    }
}
