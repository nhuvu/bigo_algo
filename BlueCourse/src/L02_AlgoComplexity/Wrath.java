/**
 * https://codeforces.com/problemset/problem/892/B
 * */
package L02_AlgoComplexity;

import java.util.Scanner;

public class Wrath {
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
        int alive = 0;
        while (j < numberOfPeople){
            if(j >= (i - clawLengthOfPeople[i])){ //when j person is killed
                j++; //move index j to next
                i = numberOfPeople - 1; //reset i person to last & check again with j+1-th person
            }else {
                i--;
                if(i == j){ //when j person still not be killed
                    alive++;
                    j++;
                    i = numberOfPeople - 1;
                }
            }
        }
        return alive + 1; //the last one is always alive as he can not be killed by anyone
    }
}
