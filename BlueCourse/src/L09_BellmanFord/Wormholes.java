/**
 * https://onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=499
 * */
package L09_BellmanFord;
import java.util.Arrays;
import java.util.Scanner;


public class Wormholes {
    public static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTest = scanner.nextInt();
        for(int i = 0; i < numOfTest; i++){
            scanner.nextLine();
            int numStar = scanner.nextInt();
            int numPath = scanner.nextInt();
            Edge[] graph = new Edge[numPath];
            for(int j = 0; j < numPath; j++){
                scanner.nextLine();
                int s = scanner.nextInt();
                int d = scanner.nextInt();
                int w = scanner.nextInt();
                Edge edge = new Edge(s,d,w);
                graph[j] = edge;
            }
            boolean flag = bellmanFord(graph, numStar, numPath);
            System.out.println(flag ? "possible" : "not possible");
        }
    }

    public static boolean bellmanFord (Edge[] graph, int vertices, int edges){
        int u,v,w;
        int[] dist = new int[vertices];
        Arrays.fill(dist, INF);
        dist[0] = 0;

        for(int i = 0; i < vertices; i++){
            for(int j = 0; j < edges; j++){
                u = graph[j].source;
                v = graph[j].destination;
                w = graph[j].weight;
                if(dist[u] != INF && dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                }
            }
        }
        //kiem tra chu trinh am - co chu trinh am => co vong lap vo han, thoa yeu cau de bai
        for(int j = 0; j < edges; j++){
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

