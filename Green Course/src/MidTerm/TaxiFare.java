package MidTerm;

import java.util.Scanner;

public class TaxiFare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        double total = 0;

        if(input == 1){
            total = 15000;
        } else if (input > 1 && input <= 5){
            total = 15000 + (input - 1) * 13500;
        } else {
            if(input < 12){
                total = 15000 + (4 * 13500) + (input - 5) * 11000;
            } else {
                total = (15000 + (4 * 13500) + (input - 5) * 11000) * 0.9;
            }
        }
        System.out.println((int) total);
    }
}
