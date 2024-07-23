/**
 * https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=1167
 * */
package L12_BinarySearchTree;

import java.util.Scanner;
import java.util.TreeMap;

public class HardwoodSpices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
        while (testcase-- > 0){
            TreeMap<String,Integer> treeMap = new TreeMap<>();
            int totalTree = 0;
            while (scanner.hasNextLine()){
                String input = scanner.nextLine();
                if(input.isEmpty()){
                    break;
                }
                totalTree++;
                if(!treeMap.containsKey(input)){
                    treeMap.put(input,1);
                }else {
                    int value = treeMap.get(input);
                    treeMap.put(input, value+1);
                }
            }
            for(String tree : treeMap.keySet()){
                System.out.format("%s %.4f\n", tree, 100.0 * treeMap.get(tree) / totalTree);
            }
            if(testcase > 0){
                System.out.println();
            }
        }
    }
}
