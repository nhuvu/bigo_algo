/**
 * https://www.spoj.com/problems/SOCIALNE/
 * */
package L10_FloydWarshall;

import java.util.Arrays;
import java.util.Scanner;

public class PossibleFriends {
    public static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        for(int i = 0; i < testcase; i++){
            scanner.nextLine();
            String s = scanner.next();
            int M = s.length();
            int[][] dist = new int[M][M];
            for(int[] row : dist){
                Arrays.fill(row, INF);
            }
            for(int j = 0; j < M; j++){
               if(j > 0){
                   s = scanner.next();
               }
               for(int k = 0; k < M; k++){
                   if(s.charAt(k) == 'Y'){
                       dist[j][k] = 1;
                   }
               }
               dist[j][j] = 0;
            }
            FloyWarshall(dist, M);
            int min_id = 0;
            int max_count = 0;
            for(int m = 0; m < M; m++){
                int count = 0;
                for (int n = 0 ; n < M; n++){
                    if(dist[m][n] == 2){
                        count++;
                    }
                }
                if(count > max_count){
                    min_id = m;
                    max_count = count;
                }
            }
            System.out.println(min_id + " " + max_count);
        }
    }

    public static void FloyWarshall(int[][] dist, int M){
        for(int k = 0; k < M; k++){
            for(int i = 0; i < M; i++){
                if(dist[i][k] == INF){
                    continue;
                }
                for(int j = 0; j < M; j++){
                    if(dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
    }
}
