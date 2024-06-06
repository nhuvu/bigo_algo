package Graph;

public class Edge {
    int u;
    int v;
    int w;

    public Edge(int u, int v){
        this.u = u;
        this.v = v;
    }

    public Edge(int u, int v, int w){
        this.u = u;
        this.v = v;
        this.w = w;
    }

    @Override
    public String toString() {
        return String.format("%d %d", this.u, this.v);
    }
}
