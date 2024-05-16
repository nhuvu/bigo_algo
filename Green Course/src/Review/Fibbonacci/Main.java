package Review.Fibbonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int n = scanner.nextInt();
        LinkedList fibo = new LinkedList();
        fibo = fibo.createFiboList(x, y, n);
        fibo.print();
    }
}
