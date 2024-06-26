/**
 * https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/bishu-and-his-girlfriend/
 * */
package L06_DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BishuAndGirlfriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCountries = scanner.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int[] distance = new int[numOfCountries + 1];
        boolean[] visited = new boolean[numOfCountries + 1];
        Arrays.fill(distance,-1);
        Arrays.fill(visited, false);
        for(int n = 0; n <= numOfCountries; n++){
            graph.add(new ArrayList<>());
        }
        for(int e = 0; e < numOfCountries - 1; e++){
            scanner.nextLine();
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        DFS(graph, distance, visited, 1);
        scanner.nextLine();
        int numOfGirls = scanner.nextInt();
        int min_distance_country = Integer.MAX_VALUE;
        int min_id = Integer.MAX_VALUE;
        for(int i = 0; i < numOfGirls; i++){
            scanner.nextLine();
            int country = scanner.nextInt();
            if(distance[country] < min_distance_country || distance[country] == min_distance_country
                && country < min_id){
                min_distance_country = distance[country];
                min_id = country;
            }
        }
        System.out.println(min_id);
    }

    public static void DFS(ArrayList<ArrayList<Integer>> graph, int[] distance, boolean[] visited, int startNode){
        distance[startNode] = 0;
        visited[startNode] = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(startNode);

        while (!stack.isEmpty()){
            int u = stack.pop();
            for(int i = 0; i < graph.get(u).size(); i++){
                int v = graph.get(u).get(i);
                if(!visited[v]){
                    visited[v] = true;
                    distance[v] = distance[u] + 1;
                    stack.push(v);
                }
            }
        }
    }
}