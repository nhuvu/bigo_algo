package Graph;

import java.util.Scanner;

public class ProductOfLoopEdges {
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

        int countLoop = 0;
        int accumulation = 1;
        for(Edge e : edges){
            if(e.u == e.v){
                countLoop++;
                accumulation *= e.w;
                accumulation %= (1000007);
            }
        }
        if(countLoop != 0){
            System.out.printf("%d %d", countLoop, accumulation);
        } else {
            System.out.println("-1");
        }
    }
}
