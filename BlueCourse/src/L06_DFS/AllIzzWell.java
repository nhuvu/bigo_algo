/**
 * https://www.spoj.com/problems/ALLIZWEL/
 */
package L06_DFS;

import java.util.Scanner;
import java.util.Stack;

public class AllIzzWell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTestcase = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numOfTestcase; i++) {
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            scanner.nextLine();
            char[][] matrix = new char[row][col];
            boolean[][] visited = new boolean[row][col];
            boolean found = false;
            for (int r = 0; r < row; r++) {
                String line = scanner.nextLine();
                for (int c = 0; c < col; c++) {
                    matrix[r][c] = line.charAt(c);
                }
            }

            for (int r = 0; r < row && !found; r++) {
                for (int c = 0; c < col && !found; c++) {
                    if (matrix[r][c] == 'A') {
                        if (allIzzWell(matrix, visited, r, c, 0)) {
                            found = true;
                        }
                    }
                }
            }
            //boolean isValid = allIzzWell(matrix, startX, startY);
            System.out.println(found ? "YES" : "NO");
            scanner.nextLine();
        }
    }

    public static boolean allIzzWell(char[][] matrix, boolean[][] visited, int startX, int startY, int index) {
        int H = matrix.length;
        int W = matrix[0].length;
        String target = "ALLIZZWELL";
        if (index == target.length()) {
            return true;
        }
        if (startX < 0 || startX >= matrix.length || startY < 0 || startY >= matrix[0].length || visited[startX][startY] || matrix[startX][startY] != target.charAt(index)) {
            return false;
        }
        visited[startX][startY] = true;
        // Possible movements: up, down, left, right, up left, up right, down left, down right
        int[] dx = {-1, 1, 0, 0, 1, 1, -1, -1};
        int[] dy = {0, 0, -1, 1, -1, 1, 1, -1};

        // Explore all eight possible directions: up, down, left, right, up left, up right, down left, down right
        for (int i = 0; i < 8; i++) {
            int newX = startX + dx[i];
            int newY = startY + dy[i];
            if (allIzzWell(matrix, visited, newX, newY, index + 1)) {
                return true;
            }
        }
        visited[startX][startY] = false;
        return false;
    }
}
