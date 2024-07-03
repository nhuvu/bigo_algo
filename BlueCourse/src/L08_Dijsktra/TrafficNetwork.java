/**
 * https://www.spoj.com/problems/TRAFFICN/
 * */
package L08_Dijsktra;

import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/*Following example: shortest posible path is 1 -> 2 <-> 3 -> 4 = 35*/
public class TrafficNetwork {
    static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dataSet = scanner.nextInt();
        for(int i = 0; i < dataSet; i++){
            scanner.nextLine();
            int numOfNodes = scanner.nextInt();
            int numOfOneWayRoad = scanner.nextInt();
            int numOfTwoWayRoad = scanner.nextInt();
            int start = scanner.nextInt();
            int destination = scanner.nextInt();

            ArrayList<ArrayList<Node>> graph = new ArrayList<>();
            for(int j = 0; j <= numOfNodes; j++){
                graph.add(new ArrayList<>());
            }
            for(int j = 0; j < numOfOneWayRoad; j++){
                scanner.nextLine();
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                int w = scanner.nextInt();
                graph.get(u).add(new Node(v, w));
            }

            for(int j = 0; j < numOfTwoWayRoad; j++){
                scanner.nextLine();
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                int w = scanner.nextInt();
                replacePath(graph, u, v, w);
            }

            int[] dist = new int[numOfNodes + 1];
            dijsktra(graph, start, dist);
            System.out.println(dist[destination] == INF ? -1 : dist[destination]);
        }
    }

    public static void replacePath(ArrayList<ArrayList<Node>>graph, int u, int v, int w){
        ArrayList<Node> nodesFromU = graph.get(u);
        ArrayList<Node> nodesFromV = graph.get(v);
        boolean UToV = false;
        boolean VToU = false;

        if(!nodesFromU.isEmpty()){
            for(Node n : nodesFromU){
                if(n.id == v){
                    UToV = true;
                    if(n.cost > w){
                        graph.get(u).remove(n);
                        graph.get(u).add(new Node(v, w));
                        graph.get(v).add(new Node(u, w));
                    }else {
                        graph.get(v).add(new Node(u, n.cost));
                    }
                    break;
                }
            }
        }
        if(!nodesFromV.isEmpty()){
            for(Node n : nodesFromV){
                if(n.id == u){
                    VToU = true;
                    if(n.cost > w) {
                        graph.get(v).remove(n);
                        graph.get(v).add(new Node(u, w));
                        graph.get(u).add(new Node(v, w));
                    }else {
                        graph.get(u).add(new Node(v, n.cost));
                    }
                    break;
                }
            }
        }

       if(!UToV && !VToU){
           graph.get(u).add(new Node(v, w));
           graph.get(v).add(new Node(u, w));

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



