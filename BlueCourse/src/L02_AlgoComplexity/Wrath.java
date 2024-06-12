/**
 * https://codeforces.com/problemset/problem/892/B
 * */
package L02_AlgoComplexity;

import java.util.Scanner;

public class Wrath {
    /**Code correct but got time exceed, O(n)*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = scanner.nextInt();
        int[] clawLengthOfPeople = new int[numberOfPeople];
        scanner.nextLine();
        for(int i = 0; i < numberOfPeople; i++){
            clawLengthOfPeople[i] = scanner.nextInt();
        }
        System.out.println(alive(numberOfPeople, clawLengthOfPeople));
    }

    public static int alive(int numberOfPeople, int[] clawLengthOfPeople){
        int j = 0;
        int i = numberOfPeople - 1;
        int alive = numberOfPeople;
        while (j < numberOfPeople - 1){
            if(j >= (i - clawLengthOfPeople[i])){ //when j person is killed
                alive--; //reduce 1 from alive
                j++; //move index j to next
                i = numberOfPeople - 1; //reset i person to last & check again with j+1-th person
            }else {
                i--;
                if(i == j+1){ //when j person still not be killed
                    j++; //move to next person
                    i = numberOfPeople - 1; //reset
                }
            }
        }
        return alive;
    }
 /** Chat GPT solution, O(1)*/

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        // Variable to store the position till which monsters can be killed
//        int killPosition = n; // Initialize to the end of the array
//        int survivors = 0;
//
//        for (int i = n - 1; i >= 0; i--) {
//            if (i < killPosition) {
//                survivors++;
//            }
//            // Update the farthest position the current monster can kill
//            killPosition = Math.min(killPosition, i - a[i]);
//        }
//
//        System.out.println(survivors);
//    }
}
