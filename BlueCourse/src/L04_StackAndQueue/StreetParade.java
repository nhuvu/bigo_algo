/**
 * https://www.spoj.com/problems/STPAR/
 */
package L04_StackAndQueue;

import java.util.*;

public class StreetParade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            scanner.nextLine();
            List<Integer> mobileQueue = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                mobileQueue.add(scanner.nextInt());
            }
            boolean isSorted = canBeSorted(mobileQueue);
            if(isSorted){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
            scanner.nextLine();
        }
    }

    public static boolean canBeSorted(List<Integer> mobileQueue) {
        Stack<Integer> mobileToAlley = new Stack<>();

        boolean flag = true;
        int i = 1;
        while (!mobileQueue.isEmpty() || !mobileToAlley.isEmpty()) {
            if (!mobileQueue.isEmpty() && mobileQueue.get(0) == i) {
                i++;
                mobileQueue.remove(0);
            }
            else if (!mobileToAlley.isEmpty() && mobileToAlley.peek() == i) {
                i++;
                mobileToAlley.pop();
            }
            else {
                if(!mobileQueue.isEmpty()){
                    int top = mobileQueue.get(0);
                    mobileToAlley.push(top);
                    mobileQueue.remove(0);
                }else {
                    flag = false;
                }
            }
        }
        return flag;
    }
}
