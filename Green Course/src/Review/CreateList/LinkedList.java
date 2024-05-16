package Review.CreateList;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public LinkedList insertTail(int x){
        Node p = new Node(x);
        if(this.head == null){
            this.head = p;
            this.tail = p;
        } else {
            this.tail.next = p;
            this.tail = p;
        }
        return this;
    }

    public LinkedList createList(){
        LinkedList ans = new LinkedList();
        ans.insertTail(this.head.data);
        Node cur = this.head;
        Node next = cur.next;
        while (next != null){
            int x = next.data + cur.data;
            ans.insertTail(x);
            cur = next;
            next = next.next;
        }
        return ans;
    }

    public void print(){
        Node p = this.head;
        while (p != null){
            System.out.printf("%d ", p.data);
            p = p.next;
        }
    }
}
