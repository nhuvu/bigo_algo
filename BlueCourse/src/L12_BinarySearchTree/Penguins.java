/**
 * https://acm.timus.ru/problem.aspx?space=1&num=1585
 * */
package L12_BinarySearchTree;

import java.util.Scanner;
import java.util.TreeMap;

public class Penguins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPenguins = scanner.nextInt();
        TreeMap<String, Integer> map = new TreeMap<>();
        scanner.nextLine();
        for(int i = 0 ; i < numPenguins; i++){
            String penguin = scanner.nextLine();
            if(!map.containsKey(penguin)){
                map.put(penguin,1);
            }else {
                int value = map.get(penguin);
                map.put(penguin, value+1);
            }
        }
        String result = null;
        int max = 0;
        for(String key : map.keySet()){
            if(max < map.get(key)){
                max = map.get(key);
                result = key;
            }
        }
        System.out.println(result);
    }
}
