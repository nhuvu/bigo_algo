/**
 * https://www.spoj.com/problems/STPAR/
 */
package L04_StackAndQueue;

import java.util.*;

public class StreetParade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Queue<Integer> mobileQueue = new LinkedList<>();
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            scanner.nextLine();
            for (int i = 0; i < num; i++) {
                mobileQueue.add(scanner.nextInt());
            }
            scanner.nextLine();
            canBeSorted(num, mobileQueue);
        }
    }

    public static void canBeSorted(int numberOfMObiles, Queue<Integer> mobileQueue) {
        ArrayList<Integer> sortedList = new ArrayList<>(mobileQueue);
        Collections.sort(sortedList);
        ArrayList<Integer> currentList = new ArrayList<>();
        Stack<Integer> mobileToAlley = new Stack<>();

        while (mobileQueue.peek() != null && 1 != mobileQueue.peek()) {
            mobileToAlley.push(mobileQueue.remove());
            if (mobileQueue.peek() != null && 1 == mobileQueue.peek()) {
                currentList.add(mobileQueue.remove());
                break;
            }
        }

        for (int i = 2; i <= numberOfMObiles; ) {
            if (!mobileQueue.isEmpty() && i != mobileQueue.peek() && !mobileToAlley.isEmpty() && i != mobileToAlley.peek()) {
                mobileToAlley.push(mobileQueue.remove());
            }
            if (!mobileQueue.isEmpty() && mobileQueue.peek() != null && i == mobileQueue.peek()) {
                currentList.add(mobileQueue.remove());
                i++;
            }
            if (!mobileToAlley.isEmpty() && mobileToAlley.peek() != null && i == mobileToAlley.peek()) {
                currentList.add(mobileToAlley.pop());
                i++;
            }
        }

        if (currentList.equals(sortedList)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
