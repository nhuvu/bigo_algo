package LinkedList.AvailableRoom;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public LinkedList insertTail(Room r){
        Node p = new Node(r);
        if (head == null) {
            this.head = p;
            this.tail = p;
        } else {
            this.tail.next = p;
            this.tail = p;
        }
        return this;
    }

    public LinkedList availableRoom(){
        Node cur = this.head;
        LinkedList avai = new LinkedList();
        while (cur != null){
            if (cur.data.vacancy == 0){
                avai.insertTail(cur.data);
            }
            cur = cur.next;
        }
        return avai;
    }

   public void print(){
        Node cur = this.head;
        while (cur != null){
            System.out.printf("%s %d \n", cur.data.roomNumber, cur.data.price);
            cur = cur.next;
        }
   }
}
