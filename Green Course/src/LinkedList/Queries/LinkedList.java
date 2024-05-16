package LinkedList.Queries;

public class LinkedList {
    Node head;
    Node tail;
    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public LinkedList insertTail(int x){
        Node ans = new Node(x);
        if(head == null){
            head = ans;
            tail = ans;
        }else{
            tail.next = ans;
            tail = ans;
        }
        return this;
    }

    public void removeHead(){
        if(head != null){
            Node next = this.head.next;
            this.head = next;
        }
    }

    public void print(){
        Node cur = this.head;
        while(cur != null){
            System.out.printf("%d ", cur.data);
            cur = cur.next;
        }
    }

}
