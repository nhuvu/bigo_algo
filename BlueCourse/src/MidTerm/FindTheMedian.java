package MidTerm;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(numbers[n/2]);

    }
}
