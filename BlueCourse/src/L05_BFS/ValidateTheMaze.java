/**
 * https://www.spoj.com/problems/MAKEMAZE/
 * */
package L05_BFS;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class ValidateTheMaze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTestcase = scanner.nextInt();
        scanner.nextLine();
        for (int c = 0; c < numOfTestcase; c++) {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            scanner.nextLine();
            char[][] cells = new char[H][W];
            for (int i = 0; i < H; i++) {
                String line = scanner.nextLine();
                for (int j = 0; j < W; j++) {
                    cells[i][j] = line.charAt(j);
                }
            }
            System.out.println(isMazeValid(cells) ? "valid" : "invalid");
        }
    }

    public static boolean isMazeValid(char[][] cells){
        int H = cells.length;
        int W = cells[0].length;
        ArrayList<int[]> spaceAtBorder = new ArrayList<>();
        //Check & collect spaces around the border of the maze
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(i == 0 || i == H - 1){
                    if(cells[i][j] == '.'){
                        spaceAtBorder.add(new int[]{i, j});
                    }
                }
                if(i != 0 && i != H - 1){
                    if(j == 0 || j == W -1){
                        if(cells[i][j] == '.'){
                            spaceAtBorder.add(new int[]{i, j});
                        }
                    }
                }
            }
        }
        if(spaceAtBorder.size() != 2){
            return false;
        }
        else {
            int[] entryPoint = spaceAtBorder.get(0);
            int[] exitPoint = spaceAtBorder.get(1);
            boolean[][] visited = new boolean[H][W];
            Queue<int[]> queue = new LinkedList<>();
            ArrayList<int[]> path = new ArrayList<>();


            int startX = entryPoint[0];
            int startY = entryPoint[1];

            queue.add(new int[]{startX, startY});
            path.add(new int[]{startX, startY});
            visited[startX][startY] = true;

            // Possible movements: up, down, left, right
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};

            while (!queue.isEmpty()){
                int[] currentPosition = queue.poll();
                int currentX = currentPosition[0];
                int currentY = currentPosition[1];

                for(int i = 0; i < 4; i++){
                    int newX = currentX + dx[i];
                    int newY = currentY + dy[i];

                    //Move around (up, down, left, right) to see if there is a path from entry to exit point
                    if (newX >= 0 && newX < H && newY >= 0 && newY < W
                            && !visited[newX][newY]
                            && (cells[newX][newY] == '.')) {
                        visited[newX][newY] = true;
                        queue.add(new int[]{newX, newY});
                        path.add(new int[]{newX, newY});
                    }
                }
            }
            for(int[] point : path){
                if(point[0] == exitPoint[0] && point[1] == exitPoint[1]){
                    return true;
                }
            }
        }
        return false;
    }
}
