package Final;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        int b = Integer.valueOf(scanner.nextLine());
        int c = Integer.valueOf(scanner.nextLine());
        System.out.println(maxResult(a,b,c));
    }

    public static int maxResult(int a, int b, int c){
        int maxResult = 0;
        int[] arr = new int[6];
        arr[0] = a + b + c;
        arr[1] = a + b * c;
        arr[2] = a * b + c;
        arr[3] = (a + b) * c;
        arr[4] = a * (b + c);
        arr[5] = a * b * c;

        for(int i = 0; i < arr.length; i++){
            if(maxResult < arr[i]){
                maxResult = arr[i];
            }
        }
        return maxResult;
    }
}
