package Graph;

import java.util.Scanner;

public class ListAdjacencyEdge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Edge[] edges = new Edge[n];
        for(int i = 0; i < n; i++){
            scanner.nextLine();
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            edges[i] = new Edge(u, v, w);
        }

        insertionSort(edges, n);
        for(Edge e : edges){
            System.out.println(e);
        }
        for(int i = k - 1; i >= 0; i--){
            System.out.println(edges[i]);
        }

    }

    public static void insertionSort(Edge[] edges, int n){
        for(int i = 1; i < n; i++){
            Edge x = edges[i];
            insertAsc(edges, i, x);
        }
    }

    public static void insertAsc(Edge[] edges, int n, Edge e){
        int j = n;
        while (j > 0){
            if(edges[j - 1].w <= e.w){
                break;
            } else {
                edges[j] = edges[j - 1];
                j--;
            }
        }
        edges[j]= e;
    }
}
