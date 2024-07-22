/**
 * https://www.hackerearth.com/practice/data-structures/trees/binary-search-tree/practice-problems/algorithm/distinct-count/
 * */
package L12_BinarySearchTree;

import java.util.Scanner;
import java.util.TreeSet;

public class DistinctCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        scanner.nextLine();
        for(int tc = 0; tc < testcase; tc++){
            int N = scanner.nextInt();
            int X = scanner.nextInt();
            TreeSet treeSet = new TreeSet();
            for(int i = 0 ; i < N; i++){
                treeSet.add(scanner.nextInt());
            }
            int size = treeSet.size();
            if(size == X){
                System.out.println("Good");
            } else if (size > X) {
                System.out.println("Average");
            } else {
                System.out.println("Bad");
            }
        }
    }
}
