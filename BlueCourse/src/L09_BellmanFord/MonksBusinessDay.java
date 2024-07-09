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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTest = scanner.nextInt();
        for (int i = 0; i < numOfTest; i++) {
            scanner.nextLine();
            int numItem = scanner.nextInt();
            int numTrader = scanner.nextInt();
            Edge[] graph = new Edge[numTrader];
            for (int j = 0; j < numTrader; j++) {
                scanner.nextLine();
                int s = scanner.nextInt();
                int d = scanner.nextInt();
                int w = scanner.nextInt();
                Edge edge = new Edge(s, d, w);
                graph[j] = edge;
            }
            boolean flag = bellmanFord(graph, numItem, numTrader);
            System.out.println(dist[2]);
        }
    }
    public static boolean bellmanFord (Edge[] graph, int vertices, int edges){
        int u,v,w;
        Arrays.fill(dist, INF);
        Arrays.fill(path, -1);
        dist[0] = 0;
        for(int i = 0; i < vertices; i++){
            for(int j = 0; j < edges; j++){
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
        for(int j = 0; j < edges; j++){
            u = graph[j].source;
            v = graph[j].destination;
            w = graph[j].weight;
            if(dist[u] != INF && dist[u] + w < dist[v]){
                return false;
            }
        }
        return true;
    }
}
