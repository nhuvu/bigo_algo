package Review.CreateList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++){
            int x = scanner.nextInt();
            list.insertTail(x);
        }
        LinkedList ans = list.createList();
        ans.print();
    }

}
