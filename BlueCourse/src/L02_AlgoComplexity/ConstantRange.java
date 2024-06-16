/**
 * https://codeforces.com/problemset/problem/602/B
 * Solution: https://www.dropbox.com/scl/fo/hx9towtlj5lvgcef18tga/AOTo1uVhVS9putPjULgtvrk/Lecture%2002?dl=0&e=1&preview=L02P06+-+Approximating+a+Constant+Range+copy.pdf&rlkey=6z81mwp8xi6dazomk5qbis49c&subfolder_nav_tracking=1
 * */
package L02_AlgoComplexity;

import java.util.ArrayList;
import java.util.Arrays;
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
        int[] frequencies = new int[100000+2];
        Arrays.fill(frequencies, 0);// (2≤n≤100 000) — the number of data points => array contains all those numbers as index
        int countDiff = 0;
        int right = 0;

        for(int left = 0; left < n - 1; left++){
            while (right < n && countDiff <=2){
                //if current sub-array has elements whose value in 2 distinct (countDiff == 2)
                //and element at 'right' position has frequency = 0
                //=> element at 'right' position is not eligible to be added to the sub-array, break this loop
                if(countDiff == 2 && frequencies[arr[right]] == 0){
                    break;
                }

                if(frequencies[arr[right]] == 0){
                    countDiff++;
                }
                frequencies[arr[right]]++;
                right++;
            }
            //check length of current sub-array (right - left) after break above loop
            maxLength = Math.max(maxLength, right - left);

            //'remove' left element (reduce countDiff & frequency of that value) from current sub-array to move forward
            if(frequencies[arr[left]] == 1){
                countDiff--;
            }
            frequencies[arr[left]]--;

        }
        return maxLength;
    }
}
