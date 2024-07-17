/**
 * https://lightoj.com/problem/extended-traffic
 * */
package L09_BellmanFord;

import java.util.Arrays;
import java.util.Scanner;

public class ExtendTraffic {
    public static final int INF = Integer.MAX_VALUE;
    public static int[] dist = new int[201];
    public static int numJunction, numPath;
    public static Edge[] graph;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTest = scanner.nextInt();
        for (int i = 0; i < numOfTest; i++) {
            scanner.nextLine();
            numJunction = scanner.nextInt();
            scanner.nextLine();
            Node[] nodes = new Node[numJunction];
            for (int k = 0; k < numJunction; k++) {
                int value = scanner.nextInt();
                nodes[k] = new Node(k+1, value);
            }
            scanner.nextLine();
            numPath = scanner.nextInt();
            graph = new Edge[numPath];

            for (int j = 0; j < numPath; j++) {
                scanner.nextLine();
                Node s = new Node();
                Node d = new Node();
                int m = scanner.nextInt();
                int n = scanner.nextInt();
                for(Node node : nodes){
                    if(node.id == m){
                        s = node;
                    }else if(node.id == n){
                        d = node;
                    }
                }
                graph[j] = new Edge(s, d);
            }
            scanner.nextLine();
            int query = scanner.nextInt();
            int[] result = new int[query];
            for (int q = 0; q < query; q++) {
                scanner.nextLine();
                int destinationNode = scanner.nextInt();
                bellmanFord(1);
                if(dist[destinationNode] < 3 || dist[destinationNode] == INF){
                    result[q] = 0;
                }else {
                    result[q] = dist[destinationNode];
                }
            }
            System.out.println(String.format("Case %d:", i + 1));
            for(int r = 0; r < result.length; r++){
                System.out.println(result[r] == 0 ? "?" : result[r]);
            }
        }
    }

    public static void bellmanFord(int start) {
        int u, v, w;
        Arrays.fill(dist, INF);
        dist[start] = 0;

        for (int i = 1; i <= numJunction - 1; i++) {
            for (int j = 0; j < numPath; j++) {
                u = graph[j].source;
                v = graph[j].destination;
                w = graph[j].weight;
                if (dist[u] != INF && dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                }
            }
        }
        //chay lai lan 2
        for (int i = 1; i <= numJunction - 1; i++) {
            for (int j = 0; j < numPath; j++) {
                u = graph[j].source;
                v = graph[j].destination;
                w = graph[j].weight;
                if (dist[u] != INF && dist[u] + w < dist[v]) {
                    dist[v] = -INF;
                }
            }
        }
    }
}
