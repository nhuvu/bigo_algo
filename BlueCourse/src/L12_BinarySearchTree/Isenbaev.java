/**
 * https://acm.timus.ru/problem.aspx?space=1&num=1837
 * */
package L12_BinarySearchTree;

import java.util.Scanner;
import java.util.TreeMap;

public class Isenbaev {
    public static int MIN = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int team = scanner.nextInt();
        scanner.nextLine();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for(int i = 0; i < team; i++){
            String line = scanner.nextLine();
            String[] names = line.split(" ");
            int min = MIN;
            for(int j = 0; j < names.length; j++){
                if(!treeMap.containsKey(names[j])){
                    if(names[j].equals("Isenbaev")){
                        treeMap.put("Isenbaev", 0);
                    }else {
                        treeMap.put(names[j], MIN);
                    }
                }
                min = Math.min(min, treeMap.get(names[j]));
            }
            if(min < MIN){
                for(String name : treeMap.keySet()){
                    if(treeMap.get(name) == MIN){
                        treeMap.put(name, min+1);
                    }
                }
            }
        }

        for(String key : treeMap.keySet()){
            if(treeMap.get(key) != MIN){
                System.out.println(key + " " + treeMap.get(key));
            }else {
                System.out.println(key + " undefined");
            }
        }
    }
}
