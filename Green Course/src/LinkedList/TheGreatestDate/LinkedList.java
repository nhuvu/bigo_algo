package LinkedList.TheGreatestDate;

import java.time.LocalDate;
import java.time.Period;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public LinkedList insertTail(int date, int month, int year){
        Node x = new Node(date, month, year);
        if(head == null){
            head = x;
            tail = x;
        } else {
            tail.next = x;
            tail = x;
        }
        return this;
    }

   public Node greatestDate(){
        Node cur = this.head;
        Node greatest = this.head;
        LocalDate date = LocalDate.of(1,1,1);
        Period pGreatest = Period.between(greatest.data, date);
        while (cur != null){
            Period curDate = Period.between(cur.data, date);
            if(pGreatest.getDays() < curDate.getDays()){
                pGreatest = curDate;
                greatest = cur;
            }
            cur = cur.next;
        }
        return greatest;
   }

}
