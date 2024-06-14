/**
 * https://codeforces.com/problemset/problem/602/B
 * */
package L02_AlgoComplexity;

import java.util.Scanner;

public class ConstantRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPoints = scanner.nextInt();
        int[] pointArr = new int[numberOfPoints];
        scanner.nextLine();
        for(int i = 0; i < numberOfPoints; i++){
            pointArr[i] = scanner.nextInt();
        }
        System.out.println(maxLengthConstantRange(numberOfPoints, pointArr));
    }

    public static int maxLengthConstantRange (int n, int[] arr){
        int maxLength = 0;
        int left = 0;
        for(int right = 0; right < n; right++){
            int minInRange = arr[left];
            int maxInRange = arr[left];
            for (int i = left; i <= right; i++) {
                minInRange = Math.min(minInRange, arr[i]);
                maxInRange = Math.max(maxInRange, arr[i]);
            }
            if (Math.abs(maxInRange - minInRange) > 1) {
                // Move right the left pointer if the range is invalid
                left++;
                // Update the range values for the new window
                minInRange = arr[left];
                maxInRange = arr[left];
                for (int i = left; i <= right; i++) {
                    minInRange = Math.min(minInRange, arr[i]);
                    maxInRange = Math.max(maxInRange, arr[i]);
                }
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
