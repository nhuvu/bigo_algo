/**
 * https://codeforces.com/problemset/problem/546/A
 * */
package MidTerm;

import java.util.Scanner;

public class SoldierAndBanana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int costFirstBanana = scanner.nextInt();
        int moneyHaving = scanner.nextInt();
        int numOfBanana = scanner.nextInt();

        int moneyBorrow = 0;
        int total = 0;
        for(int i = 0; i < numOfBanana; i++){
            total += costFirstBanana * (i + 1);
        }
        moneyBorrow = total - moneyHaving;
        if(moneyBorrow < 0){
            System.out.println(0);
        }else {
            System.out.println(moneyBorrow);
        }

    }
}
