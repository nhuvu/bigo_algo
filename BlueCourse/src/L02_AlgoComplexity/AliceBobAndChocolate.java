/**
 * https://codeforces.com/problemset/problem/6/C
 * */
package L02_AlgoComplexity;

import java.util.Scanner;

public class AliceBobAndChocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfChocolates = scanner.nextInt();
        int[] consumeMinutes = new int[numOfChocolates];
        scanner.nextLine();
        for(int i = 0; i < numOfChocolates; i++){
            consumeMinutes[i] = scanner.nextInt();
        }
        printBarsConsumed(numOfChocolates, consumeMinutes);
    }

    public static void printBarsConsumed(int numOfBars, int[] consumeMinutes){
        int aliceIndex = 0;
        int bobIndex = numOfBars - 1;
        int aliceSumMinutes = consumeMinutes[aliceIndex];
        int bobSumMinutes = consumeMinutes[bobIndex];
        if(numOfBars == 1){
            System.out.println("1 0"); //Bob leaves the only bar to Alice
        } else if (numOfBars == 2) {
            System.out.println("1 1"); //Alice 1, Bob 1 when there are only 2 bars
        } else {
            numOfBars -= 2; //Alice & Bob always consume first 2 bars so numOfBars to check with below logic need to exclude 2
            while (numOfBars > 0){
                if(aliceSumMinutes < bobSumMinutes){
                    aliceSumMinutes += consumeMinutes[++aliceIndex];
                    numOfBars--;
                } else if (aliceSumMinutes > bobSumMinutes) {
                    bobSumMinutes += consumeMinutes[--bobIndex];
                    numOfBars--;
                } else {
                    if(numOfBars == 1){
                        aliceIndex++;
                        numOfBars--;
                    }else {
                        aliceSumMinutes += consumeMinutes[++aliceIndex];
                        bobSumMinutes += consumeMinutes[--bobIndex];
                        numOfBars -= 2;
                    }
                }

            }
            int bobConsume = consumeMinutes.length - bobIndex;
            int aliceCosume = consumeMinutes.length - bobConsume;
            System.out.printf("%d %d", aliceCosume, bobConsume);
        }

    }
}
