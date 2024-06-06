package Graph;

import java.util.Scanner;

public class CheckUndirectedGraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            scanner.nextLine();
            for(int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        boolean flag = checkUndirectedGraph(n, arr);
        if(flag){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean checkUndirectedGraph(int n, int[][] arr){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] != arr[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}
