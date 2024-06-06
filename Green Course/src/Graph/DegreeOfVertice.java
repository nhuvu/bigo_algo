package Graph;

import java.util.Scanner;

public class DegreeOfVertice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int vertice = scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            scanner.nextLine();
            for(int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        int degree = 0;
        for(int j = 0; j < n; j++){
            if (arr[vertice][j] != 0) {
                degree++;
            }

        }
        System.out.println(degree);
    }
}
