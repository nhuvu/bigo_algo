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
            }
            for(int i = 0; i < num; i++){
                heap.add(scanner.nextLong());
            }

            while (heap.size() > 1){
                sum = heap.peek();
                heap.remove();
                sum += heap.peek();
                heap.remove();
                cost += sum;
                heap.add(sum);
            }
            System.out.println(cost);
            scanner.nextLine();
        }
    }
}
