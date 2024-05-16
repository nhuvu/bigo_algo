package LinkedList.TheGreatestDate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            scanner.nextLine();
            int date = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();
            linkedList.insertTail(date, month, year);
        }
        Node greatestDate = linkedList.greatestDate();
        System.out.println(greatestDate.toString());
    }
}
