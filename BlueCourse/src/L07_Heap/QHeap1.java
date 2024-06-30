/**
 * https://www.hackerrank.com/challenges/qheap1/problem
 * */
package L07_Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class QHeap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfQueries = scanner.nextInt();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0; i < numOfQueries; i++){
            scanner.nextLine();
            int q = scanner.nextInt();
            if(q == 1){
                int addNum = scanner.nextInt();
                heap.add(addNum);
            } else if (q == 2) {
                int rmNum = scanner.nextInt();
                if(!heap.isEmpty()){
                    heap.remove(rmNum);
                }
            } else if(q == 3){
                if(!heap.isEmpty()){
                    System.out.println(heap.peek());
                }
            }
        }
    }
}
