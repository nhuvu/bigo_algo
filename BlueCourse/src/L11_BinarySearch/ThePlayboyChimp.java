/**
 * https://vjudge.net/problem/UVA-10611
 * */
package L11_BinarySearch;

import java.util.Scanner;

public class ThePlayboyChimp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] height = new int[N];
        for(int i = 0; i < N; i++){
            height[i] = scanner.nextInt();
        }
        int Q = scanner.nextInt();
        for(int i = 0; i < Q; i++){
            int chimpHeight = scanner.nextInt();
            int shorter = printShorter(height, chimpHeight);
            int higher = printHigher(height, chimpHeight);
           if(shorter == -1){
               System.out.print("X ");
           }else {
               System.out.print(shorter + " ");
           }

           if(higher == -1){
               System.out.print("X");
           }else {
               System.out.print(higher);
           }
            System.out.println();
        }
    }

    public static int printShorter(int[] height, int x){
        int left = 0;
        int right = height.length - 1;
        int result = -1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(x > height[mid]){
                result = height[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static int printHigher(int[] height, int x){
        int left = 0;
        int right = height.length - 1;
        int result = -1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(x < height[mid]){
                result = height[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

}
