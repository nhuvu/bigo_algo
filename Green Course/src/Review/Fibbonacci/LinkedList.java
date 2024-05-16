package Review.Fibbonacci;

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

    public LinkedList createFiboList(int x, int y, int num){
        LinkedList fibo = new LinkedList();
        int sum = 0;
        fibo.insertTail(x);
        fibo.insertTail(y);
        //fibo.insertTail(sum);
        for(int i = 2; i < num; i++){
            sum = (x + y) % 1000007;
            fibo.insertTail(sum);
            x = y;
            y = sum;
        }
        return fibo;
    }

    public void print(){
        Node p = this.head;
        while(p != null){
            System.out.printf("%d ", p.data);
            p = p.next;
        }
    }
}
