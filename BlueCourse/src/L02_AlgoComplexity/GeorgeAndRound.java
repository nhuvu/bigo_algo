/**
 * https://codeforces.com/problemset/problem/387/B
 * */
package L02_AlgoComplexity;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GeorgeAndRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfProblemRequired = scanner.nextInt();
        int numberOfProblemPrepared = scanner.nextInt();
        int[] complexityRequired = new int[numberOfProblemRequired];
        int[] complexityPrepared = new int[numberOfProblemPrepared];

        scanner.nextLine();
        for(int i = 0; i < numberOfProblemRequired; i++){
            complexityRequired[i] = scanner.nextInt();
        }

        scanner.nextLine();
        for(int i = 0; i < numberOfProblemPrepared; i++){
            complexityPrepared[i] = scanner.nextInt();
        }

        System.out.println(findNumberOfExtraProblemNeed(complexityRequired, complexityPrepared));
    }

    public static int findNumberOfExtraProblemNeed (int[] required, int[] prepared){
        int extra = required.length;
        int i = 0, j = 0;
        while (i < required.length && j < prepared.length){
            if (required[i] < prepared[j]) {
                if(j > 0 && prepared[j] != prepared[j-1]){
                    extra--;
                }
                i++;
            } else if (required[i] > prepared[j]) {
                j++;
            } else if(required[i] == prepared[j]){
                extra--;
                i++;
                j++;
            }
        }

        return extra;
    }
}
