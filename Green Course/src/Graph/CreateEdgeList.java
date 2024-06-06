package Graph;

import java.util.Scanner;

public class CreateEdgeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            scanner.nextLine();
            for(int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        Edge[] edges = createEdgeList(n, arr);
        System.out.println(countEdge(edges));
        for(Edge e : edges){
            if(e != null){
                System.out.println(e);
            }
        }
    }

    public static Edge[] createEdgeList(int n, int[][] arr){
        Edge[] edges = new Edge[n*(n-1)/2];
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i][j] == 1){
                    edges[k++] = new Edge(i, j);
                }
            }
        }
        return edges;
    }

    public static int countEdge(Edge[] edges){
        int count = 0;
        for(Edge e : edges){
            if(e != null){
                count++;
            }
        }
        return count;
    }
}
