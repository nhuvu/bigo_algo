package LinkedList.PalindromeNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            linkedList.insertTail(input);
        }
        linkedList.printIndexOfPalindrome();
    }
}
