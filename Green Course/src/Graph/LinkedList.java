package Graph;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void insertTail(int x){
        Node p = new Node(x);
        if(this.head == null){
            this.head = p;
            this.tail = p;
        } else {
            this.tail.next = p;
            this.tail = p;
        }
    }

    public void print(){
        Node cur = this.head.next;
        while (cur != null){
            System.out.printf("%d %d \n", this.head.data, cur.data);
            cur = cur.next;
        }
    }
}
