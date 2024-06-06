package Graph;

import java.util.Scanner;

public class CreateAdjacencyList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList[] listAdjacency = new LinkedList[n];
        int countEdge = 0;
        for(int i = 0; i < n; i++){
            scanner.nextLine();
            listAdjacency[i] = new LinkedList();
            listAdjacency[i].insertTail(i);
            for(int j = 0; j < n; j++){
                int input = scanner.nextInt();
                if(input == 1){
                    listAdjacency[i].insertTail(j);
                    countEdge++;
                }
            }
        }
        System.out.println(countEdge);
        for(int i = 0; i < listAdjacency.length; i++){
            listAdjacency[i].print();
        }
    }
}
