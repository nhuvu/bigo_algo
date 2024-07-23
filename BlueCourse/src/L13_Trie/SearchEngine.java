/**
 * https://www.hackerearth.com/practice/data-structures/advanced-data-structures/trie-keyword-tree/practice-problems/algorithm/search-engine/
 * */
package L13_Trie;

import java.util.Scanner;

public class SearchEngine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        Trie root = new Trie();
        for(int i = 0; i < n; i++){
            scanner.nextLine();
            String s = scanner.next();
            int value = scanner.nextInt();
            root.addWord(s, value);
        }
        for(int i = 0; i < q; i++){
            scanner.nextLine();
            String query = scanner.next();
            System.out.println(root.getMaxValue(query));
        }
    }
}
