
/**
 * https://codeforces.com/problemset/problem/149/A
 * */
package L03_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BusinessTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int centimeterRequired = scanner.nextInt();
        int[] centimeterOfMonths = new int[12];
        scanner.nextLine();
        for(int i = 0; i < 12; i++){
            centimeterOfMonths[i] = scanner.nextInt();
        }
        System.out.println(printMinMonth(centimeterOfMonths, centimeterRequired));
    }

    public static int printMinMonth(int[] centByMonths, int centRequired){
        if(centRequired == 0){
            return 0;
        }
        int centArchived = 0;
        Arrays.sort(centByMonths);
        for(int i = centByMonths.length - 1; i >= 0; i--){
            centArchived += centByMonths[i];
            if(centArchived >= centRequired){
                return Math.abs(i - centByMonths.length);
            }
        }
        return -1;
    }
}
