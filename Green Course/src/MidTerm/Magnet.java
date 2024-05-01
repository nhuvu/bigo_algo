package MidTerm;

import java.util.Scanner;

public class Magnet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();
        int[] magnets = new int[input];
        for(int i = 0; i < input; i++){
            magnets[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(countMagnetGroup(magnets));
    }

    public static int countMagnetGroup(int[] magnet){
        int count = 1;
        for(int i = 0; i < magnet.length - 1; i++){
            if(magnet[i] != magnet[i + 1]){
                count++;
            }
        }
        return count;
    }
}
