/**
 * https://www.hackerrank.com/challenges/bfsshortreach/problem
 * */
package L05_BFS;

import java.util.*;

public class ShortestReach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestcase = scanner.nextInt();
        for(int i = 0; i < numberOfTestcase; i++){
            scanner.nextLine();
            int numOfNodes = scanner.nextInt();
            int numOfEdges = scanner.nextInt();
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            int[] distance = new int[numOfNodes + 1];
            Arrays.fill(distance,-1);
            boolean[] visited = new boolean[numOfNodes + 1];
            Arrays.fill(visited, false);
            for(int n = 0; n <= numOfNodes; n++){
                graph.add(new ArrayList<>());
            }
            for(int e = 0; e < numOfEdges; e++){
                scanner.nextLine();
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
            scanner.nextLine();
            int startNode = scanner.nextInt();
            shortestReachFromStartNodeToOtherNodes(graph, distance, visited, startNode);
            for(int k = 1; k <= numOfNodes; k++){
                if(k == startNode){
                    continue;
                }else {
                    if(distance[k] == -1){
                        System.out.print(-1 + " ");
                    }else {
                        System.out.print(distance[k] * 6 + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void shortestReachFromStartNodeToOtherNodes (ArrayList<ArrayList<Integer>> graph, int[] distance, boolean[] visited, int startNode){
        Queue<Integer> queue = new LinkedList();
        distance[startNode] = 0;
        visited[startNode] = true;
        queue.add(startNode);

        while (!queue.isEmpty()){
            int u = queue.poll();
            for (int  i = 0; i < graph.get(u).size(); i++){
                int v = graph.get(u).get(i);
                if(!visited[v]){
                    visited[v] = true;
                    distance[v] = distance[u] + 1;
                    queue.add(v);
                }
            }
        }
    }
}

