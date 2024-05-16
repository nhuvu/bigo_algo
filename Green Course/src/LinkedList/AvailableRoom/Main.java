package LinkedList.AvailableRoom;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            scanner.nextLine();
            String num = scanner.next();
            int price = scanner.nextInt();
            int vacan = scanner.nextInt();
            Room r = new Room(num, price, vacan);
            list.insertTail(r);
        }
        LinkedList ans = list.availableRoom();
        ans.print();
    }
}
