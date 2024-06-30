/**
 * https://www.spoj.com/problems/PRO/
 * */
package L07_Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Promotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int sum = 0;
        for(int i = 0; i < days; i++){
            scanner.nextLine();
            int receipts = scanner.nextInt();
            for(int j = 0; j < receipts; j++){
                heap.add(scanner.nextInt());
            }
        }
    }
}
