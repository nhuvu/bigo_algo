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
        for(int i = 0; i < n; i++){
            int currentLength = 0;
            int min = arr[i];
            int max = arr[i];
            int r = i + 1;
            while (r < n){
                min = Math.min(min, arr[r]);
                max = Math.max(max, arr[r]);
                if(max - min <= 1){ //met condition, move r index forward
                    r++;
                    if(r == n){
                        currentLength = r - i;
                        maxLength = Math.max(maxLength, currentLength);
                    }
                }else { //does not meet condition, stop r where it is and calculate current length between r & i
                    currentLength = r - i;
                    maxLength = Math.max(maxLength, currentLength);
                    break;
                }

            }
        }
        return maxLength;
    }
}
