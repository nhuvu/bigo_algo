package LinkedList.Queries;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int numQueries = scanner.nextInt();
        for(int i = 0; i < numQueries; i++){
            scanner.nextLine();
            int query = scanner.nextInt();
            if(query == 0){
                linkedList.removeHead();
            } else if (query == 1){
                int num = scanner.nextInt();
                linkedList.insertTail(num);
            }
        }
        linkedList.print();
    }
}
