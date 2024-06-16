/*
https://codeforces.com/problemset/problem/37/A
**/

package L03_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Towers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfBars = scanner.nextInt();
        int[] barLength = new int[numOfBars];
        scanner.nextLine();
        for(int i = 0; i < numOfBars; i++){
            barLength[i] = scanner.nextInt();
        }

        printTower(numOfBars, barLength);
    }

    public static void printTower(int numOfBars, int[] barLength){
        if(numOfBars == 1){
            System.out.println("1 1");
        } else {
            //sort bar's length in ascending order
            Arrays.sort(barLength);

            //use frequencies to count the display number of bar with length
            int[] frequencies = new int[1000+2];
            Arrays.fill(frequencies,0); //all bar's length frequency init = 0 (times)
            frequencies[barLength[0]]++;

            //loop through bar's length array to count max frequency of a length
            //and find min number of tower can be built
            int minNumTower = 1;
            int maxHeight = 0;
            for(int i = 1; i < numOfBars; i++){
                if(barLength[i] != barLength[i - 1]){
                    minNumTower++;
                }
                frequencies[barLength[i]]++;
                maxHeight = Math.max(maxHeight, frequencies[barLength[i]]);
            }
            System.out.printf("%d %d", maxHeight, minNumTower);
        }

    }
}
