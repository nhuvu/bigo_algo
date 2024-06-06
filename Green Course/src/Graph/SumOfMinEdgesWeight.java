package Graph;

import java.util.Scanner;

public class SumOfMinEdgesWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Edge[] edges = new Edge[n];
        for(int i = 0; i < n; i++){
            scanner.nextLine();
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            edges[i] = new Edge(u, v, w);
        }
        int minWeight = minWeight(edges);
        int sumWeight = 0;
        for(Edge e : edges){
            if(e.w == minWeight){
                sumWeight += e.w;
            }
        }
        System.out.println(sumWeight);
    }

    public static int minWeight(Edge[] edges){
        int minWeight = edges[0].w;
        for(int i = 1; i < edges.length; i++){
            if(minWeight >= edges[i].w){
                minWeight = edges[i].w;
            }
        }
        return minWeight;
    }
}
