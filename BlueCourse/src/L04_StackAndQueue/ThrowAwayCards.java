/**
 * https://vjudge.net/problem/UVA-10935#google_vignette
 * */
package L04_StackAndQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ThrowAwayCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        while (true){
            int i = Integer.parseInt(scanner.nextLine());
            if(i == 0){
                break;
            }
            array.add(i);
        }
        for (Integer i : array){
            printCards(i);
        }
    }

    public static void printCards (int number){
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder removedCards = new StringBuilder();
        removedCards.append("Discarded cards:");

        for(int i = 1; i <= number; i++){
            queue.add(i);
        }

        while (queue.size() > 1) {
            removedCards.append(" ").append(queue.poll());
            if (queue.size() > 1) {
                removedCards.append(",");
            }
            queue.add(queue.poll());
        }

        System.out.println(removedCards);
        System.out.println("Remaining card: " + queue.poll());
    }
}
