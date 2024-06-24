/**
 * https://lightoj.com/problem/guilty-prince
 * */
package L05_BFS;

import java.util.*;

public class GuiltyPrince {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTestcase = scanner.nextInt();
        scanner.nextLine();
        for (int c = 1; c <= numOfTestcase; c++) {
            int W = scanner.nextInt();
            int H = scanner.nextInt();
            scanner.nextLine();
            char[][] cells = new char[H][W];
            int startX = 0, startY = 0;
            for (int i = 0; i < H; i++) {
                String line = scanner.nextLine();
                for (int j = 0; j < W; j++) {
                    cells[i][j] = line.charAt(j);
                    if (cells[i][j] == '@') {
                        startX = i;
                        startY = j;
                    }
                }
            }
            System.out.println(String.format("Case %d: %d", c, printMovableCells(cells, startX, startY)));
        }
    }

    public static int printMovableCells(char[][] cells, int startX, int startY) {
        int H = cells.length;
        int W = cells[0].length;
        boolean[][] visited = new boolean[H][W];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        int count = 0;

        // Possible movements: up, down, left, right
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] currentPosition = queue.poll();
            int currentX = currentPosition[0];
            int currentY = currentPosition[1];
            count++; //count current position of prince

            // Explore all four possible directions: up, down, left, right
            for (int i = 0; i < 4; i++) {
                int newX = currentX + dx[i];
                int newY = currentY + dy[i];

                //Move prince around (up, down, left, right) to see current position is valid
                if (newX >= 0 && newX < H && newY >= 0 && newY < W
                        && !visited[newX][newY]
                        && (cells[newX][newY] == '.' || cells[newX][newY] == '@')) {
                    visited[newX][newY] = true;
                    queue.add(new int[]{newX, newY});
                }
            }

        }
        return count;
    }
}

