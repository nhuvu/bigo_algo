package L09_BellmanFord;

public class Node {
    public Integer id;
    public Integer value;
    public Node(int id, int v){
        this.id = id;
        this.value = v;
    }

    public Node (){
        this.id = 0;
        this.value = 0;
    }

    public int getValue(int id){
        if(this.id == id){
            return this.value;
        }
        return 0;
    }
}
