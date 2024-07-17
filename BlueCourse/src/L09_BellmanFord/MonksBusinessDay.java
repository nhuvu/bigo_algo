/**
 * https://www.hackerearth.com/practice/algorithms/graphs/shortest-path-algorithms/practice-problems/algorithm/monks-business-day/
 * */
package L09_BellmanFord;

import java.util.Arrays;
import java.util.Scanner;

public class MonksBusinessDay {
    public static final int INF = Integer.MAX_VALUE;
    public static int[] dist = new int[100];
    public static int[] path = new int[100];
    public static Edge[] graph;
    public static int numItem, numTrader;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTest = scanner.nextInt();
        for (int i = 0; i < numOfTest; i++) {
            scanner.nextLine();
            numItem = scanner.nextInt();
            numTrader = scanner.nextInt();
            graph = new Edge[numTrader];
            Arrays.fill(dist, INF);
            for (int j = 0; j < numTrader; j++) {
                scanner.nextLine();
                int s = scanner.nextInt();
                int d = scanner.nextInt();
                int w = scanner.nextInt();
                Edge edge = new Edge(s, d, w);
                graph[j] = edge;
            }
            boolean flag = bellmanFord(1);
            System.out.println(dist[3]);
        }
    }
    public static boolean bellmanFord (int start){
        int u,v,w;
        dist[start] = 0;
        for(int i = 1; i <= numItem - 1; i++){
            for(int j = 0; j < numTrader; j++){
                u = graph[j].source;
                v = graph[j].destination;
                w = graph[j].weight;
                if(dist[u] != INF && dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                    path[v] = u;
                }
            }
        }
        //kiem tra chu trinh am
        for(int j = 0; j < numTrader; j++){
            u = graph[j].source;
            v = graph[j].destination;
            w = graph[j].weight;
            if(dist[u] != INF && dist[u] + w < dist[v]){
                return true;
            }
        }
        return false;
    }
}
