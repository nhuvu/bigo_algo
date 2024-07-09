package L09_BellmanFord;

public class Edge {
    public Integer source;
    public Integer destination;
    public Integer weight;

    public Edge(int s, int d, int w){
        this.source = s;
        this.destination = d;
        this.weight = w;
    }
}
