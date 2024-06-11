/**
 * https://codeforces.com/problemset/problem/381/A
 * */
package L02_AlgoComplexity;

import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCards = scanner.nextInt();
        int[] cardList = new int[numberOfCards];
        scanner.nextLine();
        for(int i = 0; i < numberOfCards; i++){
            cardList[i] = scanner.nextInt();
        }
        printPoints(cardList);
    }

    public static void printPoints(int[] cards){
        int sereja = 0;
        int dima = 0;
        int rounds = cards.length;
        int leftMostIndex = 0, rightMostIndex = cards.length - 1;

        for(int i = 1; i <= rounds; i++){
            if(i % 2 != 0){
                if(cards[leftMostIndex] > cards[rightMostIndex]){
                    sereja += cards[leftMostIndex];
                    leftMostIndex++;
                }else {
                    sereja += cards[rightMostIndex];
                    rightMostIndex--;
                }
            }else {
                if(cards[leftMostIndex] > cards[rightMostIndex]){
                    dima += cards[leftMostIndex];
                    leftMostIndex++;
                }else {
                    dima += cards[rightMostIndex];
                    rightMostIndex--;
                }
            }
        }
        System.out.printf("%d %d", sereja, dima);
    }
}
