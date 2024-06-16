/**
 * https://codeforces.com/problemset/problem/169/A
 * */
package L03_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Chores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choreTotal = scanner.nextInt();
        int chorePetya = scanner.nextInt();
        int choreVatya = scanner.nextInt();
        int[] complexities = new int[choreTotal];
        scanner.nextLine();
        for(int i = 0; i < choreTotal; i++){
            complexities[i] = scanner.nextInt();
        }

        //sort ascending complexities
        Arrays.sort(complexities);
        //x can be any number between [max Vatya's complxity - min Petya's complexity]
        System.out.println(complexities[choreVatya] - complexities[choreVatya - 1]);
    }
}
