package L13_Trie;

public class Node {
    static final int MAX = 26;
    public Node[] child;
    public int maxValue;

    public Node(){
        this.maxValue = -1;
        this.child = new Node[MAX];
    }

}
