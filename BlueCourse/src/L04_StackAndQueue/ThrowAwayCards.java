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
        for(int i = 1; i <= number; i++){
            queue.add(i);
        }
        while (queue.size() > 1){
            if(removedCards.length() == 0){
                removedCards.append(queue.poll());
            } else {
                removedCards.append(", ").append(queue.poll());
            }
            queue.add(queue.poll());
        }

        System.out.print("Discarded cards: ");
        if(removedCards.length() > 0){
            System.out.print(removedCards);
        }
        System.out.println();
        System.out.printf("Remaining card: %d", queue.poll());
        System.out.println();
    }
}
