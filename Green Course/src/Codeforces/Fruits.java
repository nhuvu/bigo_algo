package Codeforces;

import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        boolean flag = true;
        if(arr[n-1] == 0){
            flag = false;
        }
        for (int i = 0; i < n - 3; i++) {
            if(arr[i] == 0 && arr[i+1] == 0 && arr[i+2] == 0 && arr[i+3] == 0){
                flag = false;
            }
        }
        if(flag){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        String a= "new";
    }

}
