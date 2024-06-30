/**
 * https://www.hackerearth.com/practice/data-structures/trees/heapspriority-queues/practice-problems/algorithm/monk-and-multiplication/
 * */
package L07_Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MonkAndMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfElements = scanner.nextInt();
        scanner.nextLine();
        PriorityQueue<Long> heap = new PriorityQueue<>();
        for(int i = 0; i < numOfElements; i++){
            heap.add((long)scanner.nextInt());
            if(heap.size() < 3){
                System.out.println(-1);
            } else if (heap.size() > 3) {
                heap.remove();
                long result = 1;
                for (Long h : heap) {
                    result *= h;
                }
                System.out.println(result);
            }else {
                long result = 1;
                for (Long h : heap) {
                    result *= h;
                }
                System.out.println(result);
            }
        }
    }
}
