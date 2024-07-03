package L08_Dijsktra;

class Node implements Comparable<Node> {
    Integer id;
    Integer cost;

    public Node(int id, int cost) {
        this.id = id;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node other) {
        return this.cost.compareTo(other.cost);
    }
}
