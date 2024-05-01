package Recursion;

import java.util.Scanner;

public class SumOfEven {
    static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(sumEven(0, array));
    }

    public static int sumEven(int index, int[] arr){
        int length = arr.length;
        if(index < length){
            if(arr[index] % 2 == 0){
                sum += arr[index];
            }
            index++;
            sumEven(index, arr);
        }
        return sum;
    }
}
