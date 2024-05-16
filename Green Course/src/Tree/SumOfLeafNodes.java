package Tree;

import java.util.Scanner;

public class SumOfLeafNodes {
    public static void main(String[] args) {
        BSTIntegerDO tree = new BSTIntegerDO();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++){
            int num = scanner.nextInt();
            tree.addToBST(num);
        }
        System.out.println(tree.sumOfLeafSBST());
    }

}
