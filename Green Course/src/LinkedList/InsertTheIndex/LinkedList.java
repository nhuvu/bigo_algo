package LinkedList.InsertTheIndex;

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

    public void insertIndex(){
        int i = 1;
        Node newHead = new Node(i);
        newHead.next = this.head;
        this.head = newHead;
        Node cur = newHead.next;
        while (cur.next != null){
            i++;
            Node index = new Node(i);
            index.next = cur.next;
            cur.next = index;
            cur = index.next;
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
