/**
 * https://vjudge.net/problem/UVA-10474
 * */
package L11_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class WhereIsTheMarble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNum = 0;
        while(true){
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            if(n == 0 && q == 0){
                break;
            }
            caseNum++;
            System.out.println("CASE# " + caseNum + ":");
            int[] marbles = new int[n];
            for(int i = 0; i < n; i++){
                marbles[i] = scanner.nextInt();
            }
            Arrays.sort(marbles);
            int left = 0;
            int right = marbles.length - 1;
            for(int i = 0; i < q; i++){
                int query = scanner.nextInt();
                int position = bsFirst(marbles, left, right, query);
                if(position == -1){
                    System.out.println(query + " not found");
                } else {
                    System.out.println(query + " found at " + (position + 1));
                }
            }
        }
    }
    public static int bsFirst(int[] array, int left, int right, int query){
        if(left <= right){
            int mid = left + (right - left)/2;
            if(array[mid] == query && (mid == left || query != array[mid - 1])){
                return mid;
            }
            else if(query > array[mid]){
                return bsFirst(array, mid + 1, right, query);
            } else {
                return bsFirst(array, left, mid - 1, query);
            }
        }
        return -1;
    }
}
