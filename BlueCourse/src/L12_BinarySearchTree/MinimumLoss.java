/**
 * https://www.hackerrank.com/challenges/minimum-loss/problem
 * */
package L12_BinarySearchTree;

import java.util.Scanner;
import java.util.TreeSet;

public class MinimumLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        TreeSet<Long> set = new TreeSet<>();
        long[] price = new long[n];
        for(int i = 0;  i < n; i++){
            price[i] = scanner.nextLong();
        }
        set.add(price[0]);
        long minLoss = Long.MAX_VALUE;
        for(int i = 1; i < n; i++){
            Long currentPrice = price[i];
            Long higherPrice = set.higher(currentPrice); //find smallest element that is greater than current price
            if(higherPrice != null){
                long loss = higherPrice - currentPrice;
                minLoss = Math.min(loss, minLoss);
            }
            set.add(currentPrice);
        }
        System.out.println(minLoss);
    }
}
