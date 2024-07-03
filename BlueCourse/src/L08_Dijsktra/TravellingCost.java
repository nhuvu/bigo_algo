/**
 * https://www.spoj.com/problems/TRVCOST/
 * */
package L08_Dijsktra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TravellingCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPath = scanner.nextInt();
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        for(int i = 0; i < 501; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < numOfPath; i++){
            scanner.nextLine();
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            graph.get(u).add(new Node(v,w));
            graph.get(v).add(new Node(u,w));
        }
        int startNode = scanner.nextInt();
        int[] dist = new int[501];
        dijsktra(graph, startNode, dist);

        int destinations = scanner.nextInt();
        for(int i = 0; i < destinations; i++){
            int q = scanner.nextInt();
            if(dist[q] != Integer.MAX_VALUE){
                System.out.println(dist[q]);
            }else {
                System.out.println("NO PATH");
            }
        }

    }

    public static void dijsktra(ArrayList<ArrayList<Node>>graph, int startNode, int[] dist){
        PriorityQueue<Node> heap = new PriorityQueue<>();
        Arrays.fill(dist, Integer.MAX_VALUE);

        heap.add(new Node(startNode, 0));
        dist[startNode] = 0;

        while (!heap.isEmpty()){
            Node top = heap.poll();
            int u = top.id;
            int w = top.cost;
            for(int i = 0; i < graph.get(u).size(); i++){
                Node neighbor = graph.get(u).get(i);
                if(w + neighbor.cost < dist[neighbor.id]){
                    dist[neighbor.id] = w + neighbor.cost;
                    heap.add(new Node(neighbor.id, dist[neighbor.id]));
                }
            }
        }
    }
}

