/**
 * https://www.spoj.com/problems/PRO/
 * */
package L07_Heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Promotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int sum = 0;
        for(int i = 0; i < days; i++){
            scanner.nextLine();
            int numOfReceipt = scanner.nextInt();
            int[] receipts = new int[numOfReceipt];
            for(int j = 0; j < numOfReceipt; j++){
                int currentNum = scanner.nextInt();
                receipts[j] = currentNum;
                minHeap.add(currentNum);
            }

            int maxReceipt = minHeap.peek();
            int minReceipt = minHeap.peek();

            for(int j = 0; j < numOfReceipt; j++){
                if(maxReceipt <= receipts[j]){
                    maxReceipt = receipts[j];
                }
                if(minReceipt >= receipts[j]){
                    minReceipt = receipts[j];
                }
            }

            int prize = maxReceipt - minReceipt;
            sum += prize;

            minHeap.remove(minReceipt);
            minHeap.remove(maxReceipt);
        }
        System.out.println(sum);
    }
}
