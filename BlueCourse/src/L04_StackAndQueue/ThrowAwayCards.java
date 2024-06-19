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
        ArrayList<Integer> removedCards = new ArrayList<>();
        for(int i = 1; i <= number; i++){
            queue.add(i);
        }
        while (queue.size() > 1){
            int top = queue.peek();
            removedCards.add(top);
            queue.remove();
            top = queue.peek();
            queue.remove();
            queue.add(top);
        }

        System.out.print("Discarded cards: ");
        if(removedCards.size() > 0){
            for(int i = 0; i < removedCards.size() - 1; i++){
                System.out.printf("%d, ", removedCards.get(i));
            }
            System.out.printf("%d", removedCards.getLast());
        }
        System.out.println();
        System.out.printf("Remaining card: %d", queue.peek());
        System.out.println();
    }
}
