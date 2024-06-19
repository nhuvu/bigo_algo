/**
 * https://www.spoj.com/problems/STPAR/
 * */
package L04_StackAndQueue;

import java.util.*;

public class StreetParade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            Queue<Integer> mobileQueue = new LinkedList<>();
            int num = scanner.nextInt();
            if(num == 0){
                break;
            }
            scanner.nextLine();
            for(int i = 0; i < num; i++){
                mobileQueue.add(scanner.nextInt());
            }
            scanner.nextLine();
            canBeSorted(mobileQueue);
        }
    }

    public static void canBeSorted(Queue<Integer> queue){
        ArrayList<Integer> sortedList = new ArrayList<>(queue);
        ArrayList<Integer> currentList = new ArrayList<>();
        Stack<Integer> mobiles = new Stack<>();
        Collections.sort(sortedList);


            for(int i = 0; i < sortedList.size(); ){
                if(queue.peek() != null && queue.peek() > sortedList.get(i)){
                    mobiles.add(queue.peek());
                    queue.remove();
                } else if(queue.peek() != null && queue.peek() == sortedList.get(i)){
                    currentList.add(queue.peek());
                    queue.remove();
                    i++;
                }
                if(queue.size() == 0){
                    break;
                }
            }


        while (mobiles.size() > 0){
            currentList.add(mobiles.pop());
        }
        if(currentList.equals(sortedList)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
