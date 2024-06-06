package Final;

import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arrLeft = new int[m];
        int[] arrRight = new int[n];
        scanner.nextLine();
        for(int i = 0; i < m; i++){
            arrLeft[i] = scanner.nextInt();
        }
        scanner.nextLine();
        for(int i = 0; i < n; i++){
            arrRight[i] = scanner.nextInt();
        }

        int[] ans = merge(arrLeft, m, arrRight, n);
        for(int num : ans){
            System.out.printf("%d ", num);
        }
        System.out.println(ans.length);
        System.out.println(ans[ans.length - k - 1]);
    }

    public static int[] merge (int[] Left, int leftLength, int[] Right, int rightLength){
        int i,j,k;
        i = j = k = 0;
        int[] arr = new int[leftLength + rightLength];
        while (i < leftLength && j < rightLength){
            if(Left[i] > Right[j]){
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        while (i < leftLength){
            arr[k] = Left[i];
            i++;
            k++;
        }

        while (j < rightLength){
            arr[k] = Right[j];
            j++;
            k++;
        }
        return arr;
    }
}
