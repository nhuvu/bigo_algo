package MidTerm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sudoku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        if(validSudoku(arr)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    public static boolean validSudoku(int[][] sudoku){
        if(!checkValidSubsquares(sudoku)){
            return false;
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                int[] colArray = getColArray(j, sudoku);
                if(!checkValidArr(sudoku[i]) || !checkValidArr(colArray)){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean checkValidSubsquares(int [][] grid){
        for (int row = 0 ; row < 9; row = row + 3) {
            for (int col = 0; col < 9; col = col + 3) {
                Set<Integer> set = new HashSet<Integer>();
                for(int r = row; r < row+3; r++) {
                    for(int c= col; c < col+3; c++){
                        // Checking for values outside 0 and 9;
                        // 0 is considered valid because it
                        // denotes an empty cell.
                        // Removing zeros and the checking for values and
                        // outside 1 and 9 is another way of doing
                        // the same thing.
                        if (grid[r][c] <= 0 || grid[r][c] > 9){
                            return false;
                        }
                        // Checking for repeated values.
                        else if (grid[r][c] != 0){
                            if (set.add(grid[r][c]) == false) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean checkValidArr(int[] arr){
        //check has 1-9
        for(int r : arr){
            if(r <= 0 || r > 9){
                return false;
            }
        }
        //check duplicate
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i != j && arr[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] getColArray(int index, int[][] arr){
        int[] colArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            colArray[i] = arr[i][index];
        }
        return colArray;
    }
}
