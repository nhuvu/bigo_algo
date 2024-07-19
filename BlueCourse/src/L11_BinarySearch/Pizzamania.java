/**
 * https://www.spoj.com/problems/OPCPIZZA/
 * */
package L11_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Pizzamania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        for(int tc = 0; tc < testcase; tc++){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            for(int i = 0 ; i < n; i++){
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            int count = 0;
            for(int i = 0; i < n; i++){
                int current = a[i];
                int lookUp = k - current;
                int result = binarySearch(a, i + 1, n - 1, lookUp);
                if(result != -1){
                    count++;
                }
            }
            System.out.println(count);

        }
    }

    public static int binarySearch(int[] a, int left, int right, int x){
        if(left <= right){
            int mid = left + (right - left)/2;
            if(a[mid] == x){
                return mid;
            }else if(x > a[mid]){
                return binarySearch(a, mid + 1, right, x);
            }else {
                return binarySearch(a, left, mid - 1, x);
            }
        }
        return -1;
    }
}
