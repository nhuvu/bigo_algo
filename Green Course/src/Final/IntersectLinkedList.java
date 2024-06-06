package Final;

import java.util.Scanner;

public class IntersectLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList first = new LinkedList();
        LinkedList second = new LinkedList();
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            first.insertTail(input);
        }
        first.print();
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            second.insertTail(input);
        }
        second.print();
        LinkedList ans = first.findIntersect(second);
        ans.print();
    }
}
