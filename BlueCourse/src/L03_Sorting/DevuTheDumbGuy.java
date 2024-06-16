/**
 *https://codeforces.com/problemset/problem/439/B
 * */
package L03_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class DevuTheDumbGuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSubjects = scanner.nextInt();
        int hourOfFirstSubject = scanner.nextInt();
        int[] subjects = new int[numberOfSubjects];
        scanner.nextLine();
        for(int i = 0; i < numberOfSubjects; i++){
            subjects[i] = scanner.nextInt();
        }

        long totalTime = 0;
        //sort asceding the array
        Arrays.sort(subjects);
        for(int s : subjects){
            totalTime += (long) hourOfFirstSubject * s;
            if(hourOfFirstSubject > 1){
                hourOfFirstSubject--;
            }
        }
        System.out.println(totalTime);
    }
}
