package MidTerm;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int increment = -1;
        for(int i = 1; i <= input; i++){
            for(int j = input - i; j > 0; j--){
                System.out.print(" ");
            }
            increment++;
            for(int z = 0; z < i + increment; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
