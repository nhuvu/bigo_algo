package Tree;

import java.util.Scanner;

public class MaxScoreStudent {
    public static void main(String[] args) {
        BSTStudentDO tree = new BSTStudentDO();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            scanner.nextLine();
            String id = scanner.next();
            String name = scanner.next();
            float score = scanner.nextFloat();
            Student s = new Student(id, name, score);
            tree.addToBST(s);
        }
        System.out.println(tree.highestScoreBST());
    }
}
