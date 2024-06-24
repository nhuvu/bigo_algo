/**
 * https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/dhoom-4/
 * */
package L05_BFS;

import java.util.*;

public class Dhoom4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentKeyValue = scanner.nextInt();
        int lockValue = scanner.nextInt();
        scanner.nextLine();
        int numOfKey = scanner.nextInt();
        scanner.nextLine();
        int[] keys = new int[numOfKey];
        for(int i = 0; i < numOfKey; i++){
            keys[i] = scanner.nextInt();
        }

        System.out.println(minTimeToGetLockKey(currentKeyValue, lockValue, keys));
    }

    public static int minTimeToGetLockKey(int innitialKey, int targetKey, int[] keys){
        final int MOD = 100000;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[MOD];
        queue.add(innitialKey);
        visited[innitialKey] = true;
        int steps = 0;

        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int currentKey = queue.poll();
                if(currentKey == targetKey){
                    return steps;
                }
                for(int key : keys){
                    int newKey = (int)((long)currentKey * key % MOD);
                    if(newKey < 0){
                        newKey += MOD;
                    }
                    if(!visited[newKey]){
                        visited[newKey] = true;
                        queue.add(newKey);
                    }
                }
            }
            steps++;
        }
        return -1; //if not possible
    }
}
