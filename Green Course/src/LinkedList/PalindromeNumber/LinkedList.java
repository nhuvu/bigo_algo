package LinkedList.PalindromeNumber;

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

    public void printIndexOfPalindrome(){
        int index = -1;
        Node cur = this.head;
        while (cur != null){
            index++;
            if(isPalindrome(cur.data)){
                System.out.printf("%d ", index);
            }
            cur = cur.next;
        }
    }

    public boolean isPalindrome (int input){
        boolean flag;
        if(input < 10){
            flag = true;
        }
        if(input == reverse(input)){
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public int reverse (int input){
        int result = 0;
        while (input > 0){
            result = result * 10 + input % 10;
            input = input / 10;
        }
        return result;
    }
}
