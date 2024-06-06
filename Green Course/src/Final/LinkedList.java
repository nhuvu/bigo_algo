package Final;

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

    public LinkedList findIntersect(LinkedList list){
        LinkedList ans = new LinkedList();
        Node cur = this.head;
        while (cur != null){
            Node curList = list.head;
            while (curList != null){
                if(cur.data == curList.data){
                    Node curAns = ans.head;
                    boolean duplicate = false;
                    while(curAns != null){
                        if(curAns.data == cur.data){
                            duplicate = true;
                            break;
                        }
                        curAns = curAns.next;
                    }
                    if(duplicate == false) {
                        ans.insertTail(cur.data);
                    }
                }
                curList = curList.next;
            }
            cur = cur.next;
        }
        return ans;
    }

    public void print(){
        Node cur = this.head;
        while(cur != null){
            System.out.printf("%d ", cur.data);
            cur = cur.next;
        }
    }
}
