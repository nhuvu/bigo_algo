/**
 * https://vjudge.net/problem/UVA-10954
 * */
package L07_Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class AddAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int num = scanner.nextInt();
            if(num == 0){
                break;
            }
            scanner.nextLine();
            PriorityQueue<Long> heap = new PriorityQueue<>();
            long cost = 0, sum = 0;
            if(num == 2){
                for(int i = 0; i < 2; i++){
                    cost += scanner.nextLong();
                }
            } else {
                for(int i = 0; i < num; i++){
                    long numAdd = scanner.nextLong();
                    heap.add(numAdd);
                }
            }


            while (heap.size() > 1){
                long peek_1 = heap.poll();
                long peek_2 = heap.poll();
                sum = peek_1 + peek_2;
                cost += sum;
                heap.add(sum);
            }
            System.out.println(cost);
            scanner.nextLine();
        }
    }
}
