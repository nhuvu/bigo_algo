/**
 * https://codeforces.com/problemset/problem/224/B
 * */
package L02_AlgoComplexity;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int distinctNumber = scanner.nextInt();
        int[] array = new int[arrayLength];
        scanner.nextLine();
        for(int i = 0; i < arrayLength; i++){
            array[i] = scanner.nextInt();
        }
        printMinimalSegment(arrayLength, array, distinctNumber);
    }

    public static void printMinimalSegment(int n, int[] array, int distinctNum){
        Map<ArrayList<Integer>,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            Set<Integer> distinct = new HashSet<>();
            int j = i;
            distinct.add(array[j]);
            while (j < n - 1){
                if(distinct.size() == distinctNum){
                    ArrayList<Integer> arr = new ArrayList<>();
                    arr.add(i);
                    arr.add(j);
                    int distance = j - i + 1;
                    map.put(arr, distance);
                    break;
                }
                j++;
                distinct.add(array[j]);
            }
        }
        if(map.isEmpty()){
            System.out.println("-1 -1");
        } else {
            map.forEach( (k, v) -> {
                System.out.println("Array: " + k + " Length:" + v);
            });
            Map.Entry<ArrayList<Integer>,Integer> minEntry = map.entrySet()
                    .stream()
                    .findFirst()
                    .get();
            for (var entry : map.entrySet()) {
                if(minEntry.getValue() > entry.getValue()){
                    minEntry = entry;
                }
            }
            ArrayList<Integer> result = minEntry.getKey();
            System.out.printf("%d %d", result.get(0) + 1, result.get(1) + 1);
        }
    }
}
