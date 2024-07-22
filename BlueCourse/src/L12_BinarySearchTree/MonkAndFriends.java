/**
 * https://www.hackerearth.com/practice/data-structures/trees/binary-search-tree/practice-problems/algorithm/monk-and-his-friends/
 * */
package L12_BinarySearchTree;

import java.util.Scanner;
import java.util.TreeSet;

public class MonkAndFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        for(int tc = 0; tc < T; tc++){
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            TreeSet<Long> set = new TreeSet<>();
            for(int n = 0; n < N; n++){
                set.add(scanner.nextLong());
            }
            for(int m = 0; m < M; m++){
                long arrive = scanner.nextLong();
                if(set.contains(arrive)){
                    System.out.println("YES");
                }else {
                    set.add(arrive);
                    System.out.println("NO");
                }
            }
        }
    }
}
