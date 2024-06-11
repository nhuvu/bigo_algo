/**
 * https://codeforces.com/problemset/problem/279/B
 * */
package L02_AlgoComplexity;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bookNumber = scanner.nextInt();
        int freeTime = scanner.nextInt();
        ArrayList<Integer> timeToReadEachBook = new ArrayList<>();
        scanner.nextLine();
        for(int i = 0; i < bookNumber; i++){
            timeToReadEachBook.add(scanner.nextInt());
        }

        System.out.println(maxBook(timeToReadEachBook, freeTime));

    }

    public static int maxBook(ArrayList<Integer> minutes, int freeTime){
        int maxBook = 0;
        int readTime = 0;

        int startBookIndex = 0;
        for(int endBookIndex = 0; endBookIndex < minutes.size(); endBookIndex++){
            readTime += minutes.get(endBookIndex);

            // nếu tổng từ start_book -> end_book bị lố freeTime thì ta chỉ cần
            // loại start_book mà không cần thay đổi end_book
            while (readTime > freeTime){
                readTime -= minutes.get(startBookIndex);
                startBookIndex++;
            }
            // đến đây thì read_time chác chắn <= freeTime
            maxBook = Math.max(maxBook, endBookIndex - startBookIndex + 1); //+1 because the index starts at 0
        }
        return maxBook;
    }
}
